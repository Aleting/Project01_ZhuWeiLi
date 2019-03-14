package cn.edu.qut.controller;

import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Orde;
import cn.edu.qut.service.OrderService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    /**
     * 订单数据
     */
    @RequiresPermissions("order:info")
    @RequestMapping("/order_info")
    @ResponseBody
    public Msg getOrderWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Orde> orders = orderService.getOrder();

        PageInfo pageInfo_order = new PageInfo(orders, 5);
        return Msg.success().add("pageInfo_order",pageInfo_order);
    }


    @RequestMapping("/select_order")

    public @ResponseBody
    JSON selectOrder(int page, int limit, String id, HttpSession httpSession){
        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        JSON json1=null;
        int count = orderService.count(store_id);
        if(id==null||id=="") {
            List<Orde> eilist = orderService.findAllPage(store_id,(page - 1) * 5);
            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        }
        else{
            int order_id = Integer.parseInt(id);
            System.out.println(order_id);
            Orde eilist1 = orderService.selectId(order_id,store_id);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
            json1= (JSON) JSON.parse(jso);
            return json1;
        }

    }

    @RequestMapping("/select_order_customer")

    public @ResponseBody JSON selectOrdCus(int page, int limit,String id,String data,HttpSession httpSession){
        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        JSON json1=null;
        System.out.println("方法被调用！");
        int count = orderService.count(store_id);
        if(id==null||id=="") {

            List<Orde> eilist = orderService.findOrders(store_id,(page - 1) * 5);

            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        }
        else{
            if(data.equals("1")){
                int order_id = Integer.parseInt(id);
                Orde eilist1 = orderService.selectId(order_id,store_id);
                JSONArray json2 = JSONArray.fromObject(eilist1);
                String js = json2.toString();
                String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
                json1= (JSON) JSON.parse(jso);
            }
            else {
                List<Orde> eilist1 = orderService.selectCustomerName(id,store_id);
                JSONArray json2 = JSONArray.fromObject(eilist1);
                String js = json2.toString();
                String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
                json1= (JSON) JSON.parse(jso);
            }

            return json1;
        }

    }
    /**
     * 导出excel
     */
//controller
    @RequestMapping("/feeList")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody String export(HttpServletResponse response,HttpSession httpSession){
        System.out.println(1);
        response.setContentType("application/binary;charset=UTF-8");
        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        try{
            System.out.println(2);

            ServletOutputStream out=response.getOutputStream();
            String fileName=new String(("CostInfo "+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            String[] titles = { "订单编号", "订单时间", "总金额", "状态" ,"顾客编号","收货地址","支付类型"};
            orderService.export(titles, out,store_id);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }

    /**
     * 更改订单状态
     */
    @RequestMapping("/update_OrderState")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody Msg update_OrderState(@RequestParam("id") String id,@RequestParam("check") String check){
        System.out.println("id"+id+"check"+check);
        if(check.equals("true")){
            check="1";
        }
        else {
            check="0";
        }
        int orde = Integer.parseInt(id);
        orderService.updateOrderState(orde,check);
        System.out.println("执行完成！");
        return Msg.success();
    }
}
