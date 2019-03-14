package cn.edu.qut.controller;

import cn.edu.qut.entity.Customer;
import cn.edu.qut.entity.Msg;
import cn.edu.qut.service.CustomerService;
import cn.edu.qut.service.SellerService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 分页
 * 处理顾客增删改查
 */
@Controller
@RequestMapping("/cus")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    SellerService sellerService;

    /**
     * 添加客户功能
     * 需要前台传ajax表格数据
     * @RequestParam("add")
     * @return
     */
    @RequestMapping("/add_Customer")
    @ResponseBody
    public Msg add_Customer(@RequestParam("customer_info") String customer_info,@RequestParam("customerId") String customerId, HttpSession httpSession){
        //获取前台传来的json数据
        System.out.println("customerId"+customerId);
        String sellerId = (String) httpSession.getAttribute("sellerId");
        int id = Integer.parseInt(sellerId);
        JSONObject jsonObject = JSONObject.fromObject(customer_info);
        Customer customer = new Customer();
        customer.setRoleId(4);
        customer.setCustomerLoginName((String) jsonObject.get("customerLoginName"));
        customer.setCustomerRealName((String) jsonObject.get("customerRealName"));
        customer.setCustomerPassword((String) jsonObject.get("customerPassword"));
        customer.setCustomerPhone((String) jsonObject.get("customerPhone"));
        customer.setCustomerImg(jsonObject.getString("customerImg"));
        customer.setCustomerGrade(jsonObject.getString("dengji"));
        customer.setClMemo(jsonObject.getString("备注"));
        customer.setCustomerRegDate(new Date());

        System.out.println(customer.toString());
        if(customerId==null||customerId==""){
            System.out.println("没有id");
            customer.setCustomerId((int)(Math.random()*10000));
            customer.setSellerId(id);
            customerService.add_customer(customer);
        }
        else {
            System.out.println("有id");
            customer.setCustomerId(Integer.parseInt(customerId));
            customerService.update_customer(customer);
        }
        System.out.println("Controller层结束");
        return Msg.success();
    }

    /**
     * 需要导入JSON包
     * @param pn
     * @return
     */
//    客户分页数据
    @RequestMapping("/customer_page")
    @ResponseBody
    public Msg getCustomersWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Customer> customers = customerService.getAll();
        PageInfo pageInfo = new PageInfo(customers, 5);
        return Msg.success().add("pageInfo",pageInfo);
    }

    /**
     * 根据ID查询个人信息
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getCustomer(@PathVariable("id") Integer id){
        System.out.println("正在请求客户信息数据！");
        List<Customer> customer = customerService.getCus(id);
        return Msg.success().add("customer",customer);
    }


    /**
     * 顾客个人信息修改
     */
    @RequestMapping("/update_customer")
    @ResponseBody
    public Msg Update_Seller(@RequestParam("person") String person,@RequestParam("id") int id){
        System.out.println("update_customer");
        JSONObject person_info = JSONObject.fromObject(person);
        /**
         * 这里写从前端获取的数据
         */
        Customer customer = new Customer();
        /**
         * 测试数据
         */

        customer.setCustomerId(id);
        customer.setCustomerLoginName((String) person_info.get("customerLoginName"));
        customer.setCustomerRealName((String) person_info.get("customerRealName"));
        customer.setCustomerPhone((String) person_info.get("customerPhone"));
        customer.setCustomerEpay((String) person_info.get("customerEpay"));
        customerService.update_customer(customer);
        return Msg.success();
    }

    /**
     * 图片上传
     * @param file
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload_images", method = {RequestMethod.POST})
    @ResponseBody
    public JSONObject upload_images(MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println(file);
        Assert.notNull(file, "上传文件不能为空");
        String src="/static/images/";
        String path = request.getSession().getServletContext().getRealPath("/"+src);
        System.out.println(path);
        //  String path="C:/Users/lenove/Desktop/why123/why123/src/main/webapp/plug-in/images/people";
        JSONObject json = new JSONObject();
        //System.currentTimeMillis()根据系统时间产生随机数，保证上传的图片名字不一样
        String name=System.currentTimeMillis()+file.getOriginalFilename();
        System.out.println(name);
        File dir = new File(path, name);
        System.out.println(dir);
        src=src+name;
        if (!dir.exists()) {
            dir.mkdirs();
            json.put("msg","上传成功");
            json.put("code",0);
            json.put("src",src);
        } else {
            json.put("msg","上传失败");
            json.put("code",1);
        }
        file.transferTo(dir);
        return json;
    }

/**
 * 查询所有客户
 */
@RequestMapping("/seleCus")

public @ResponseBody JSON fenlei(int page, int limit, String phone,HttpSession session) {
    String sellerId=(String) session.getAttribute("sellerId");
    System.out.println("phone"+phone);
    //通过id获取店铺id
    JSON json1=null;
    if(phone == ""||phone == null){
        int count = customerService.count(Integer.parseInt(sellerId));
        //后台代码返回sortid和sortname
        List<Customer> customers= customerService.select_cus(Integer.parseInt(sellerId),(page - 1) * 5);
        JSONArray json = JSONArray.fromObject(customers);
        String js1 = json.toString();
        String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
        System.out.println(jso);
        json1 = (JSON) JSON.parse(jso);
        return json1;
    }
    else{
        Customer customers = customerService.selectPhone(phone,Integer.parseInt(sellerId));
        JSONArray json = JSONArray.fromObject(customers);
        String js1 = json.toString();
        String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + 1 + ",\"data\":" + js1 + "}";//转为layui需要的json格式
        System.out.println(jso);
        json1 = (JSON) JSON.parse(jso);
        return json1;
    }
}

    /**
     * 获取所有客户
     * @param id
     * @return
     */
    @RequestMapping("/seleCus2")
    @ResponseBody
    public List<Customer> fenlei(@RequestParam("id") int id) {
        System.out.println("获取顾客中...");
        //通过id获取店铺id
        JSON json1=null;
        //后台代码返回sortid和sortname
        List<Customer> customers= customerService.select_cus2(id);
        System.out.println(customers.get(0).getCustomerId());
        System.out.println(customers.get(0).getCustomerLoginName());
        System.out.println("获取成功！");
        return customers;
    }
    /**
     * 删除顾客
     * @param id
     * @return
     */
    @RequestMapping("/delete_customer")
    public @ResponseBody Msg delectCustomer(String id){
        System.out.println("delect——customer被调用");
        customerService.deleteCustomer(Integer.parseInt(id));
        return Msg.success();
    }


}