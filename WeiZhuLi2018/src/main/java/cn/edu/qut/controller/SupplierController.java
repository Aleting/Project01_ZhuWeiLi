package cn.edu.qut.controller;

import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.entity.Supplier;
import cn.edu.qut.service.SellerService;
import cn.edu.qut.service.SupplierService;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @Autowired
    SellerService sellerService;
//    /**
//     * JSON供应商数据
//     */
//    @RequiresPermissions("supplier:info")
//    @RequestMapping("/supplier_info")
//    @ResponseBody
//    public Msg getSupplierWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
//        PageHelper.startPage(pn, 5);
//        List<Supplier> suppliers = supplierService.all_supplier(store_id);
//
//        PageInfo pageInfo_suppliers = new PageInfo(suppliers, 5);
//        return Msg.success().add("pageInfo_suppliers",pageInfo_suppliers);
//    }

    /**
     * 添加供应商
     * 供应商管理页面添加供应商
     * @RequestParam("information") 接收数据
     * 需要前台传ajax数据来接收表格数据
     */
//    @RequiresPermissions("supplier:add")
//    @RequestMapping("/add_supplier")
//    @ResponseBody
//    public Msg add_supplier(@RequestParam("add") String add){
//        /**
//         * 接收ajax数据
//         */
//        System.out.println("修改供应商函数已调用！");
//        //System.out.println(add);
//
//        JSONObject json_test = JSONObject.fromObject(add);
//        //System.out.println(json_test.get("Seller_login_name"));
//
//        Supplier supplier = new Supplier();
//        supplier.setSupplierId(json_test.getInt("supplierId"));
//        supplier.setSupplierName(json_test.getString("supplierName"));
//        supplier.setSupplierContacts(json_test.getString("supplierContacts"));
//        supplier.setSupplierWx(json_test.getString("supplierWx"));
//        supplier.setSupplierEpay(json_test.getString("supplierEpay"));
//        supplier.setSupplierPhone(json_test.getString("supplierPhone"));
//        supplier.setSupplierMemo(json_test.getString("supplierMemo"));
//        supplierService.add_supplier(supplier);
//        /**
//         * 若插入成功 则返回状态为200
//         */
//        System.out.println("结束Su");
//        return Msg.success();
//    }
//    /**
//     * 模糊查询供应商名称
//     * 需要前台ajax传输供应商名称
//     * @RequestParam("supplier_name")来接收其姓名
//     */
//    @RequiresPermissions("supplier:select")
//    @RequestMapping("select_supplier")
//    @ResponseBody
//    public Msg select_supplier(String supplier_name,HttpSession httpSession){
//        /**
//         * 这里用假数据接收
//         */
//        String sellerId=(String) httpSession.getAttribute("storeId");
//        int store_id = Integer.parseInt(sellerId);
//
//        String name="";
//        List<Supplier> suppliers = supplierService.select_supplier(name,store_id);
//        /**
//         * 将返回的json数据存入在suppliers中
//         * 需要前台在success回调函数中获取
//         */
//        return Msg.success().add("suppliers",suppliers);
//    }

    /**回显所有供应商
     *
     */
    @RequestMapping("/select_order_customer")

    public @ResponseBody
    JSON selectOrdCus(int page, int limit, String id, String data, HttpSession httpSession){

        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        JSON json1=null;
        System.out.println("方法被调用！");
        int count = supplierService.count(store_id);
        if(id==null||id=="") { ;
            List<Supplier> eilist = supplierService.all_supplier(store_id);
            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        }
        else{
                List<Supplier> eilist1 = supplierService.select_supplier(id,store_id);
                JSONArray json2 = JSONArray.fromObject(eilist1);
                String js = json2.toString();
                String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
                json1= (JSON) JSON.parse(jso);
            return json1;
        }

    }

    /**
     * 导出excel
     * @param response
     * @param httpSession
     * @return
     */
    @RequestMapping("/feeList")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody String export(HttpServletResponse response,HttpSession httpSession){
        response.setContentType("application/binary;charset=UTF-8");
        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        try{
            ServletOutputStream out=response.getOutputStream();
            String fileName=new String(("CostInfo "+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            String[] titles = { "供货商编号", "名称", "联系人", "微信" ,"支付宝账号","电话","店铺编号","备注"};
            supplierService.export(titles, out,store_id);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }

    /**
     *删除供应商
     * @param id
     * @return
     */

    @RequestMapping("/delete_supplier")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody boolean deleteSupplier(String id){
        int supplierId = Integer.parseInt(id);
        supplierService.deleteSupplier(supplierId);
        return true;

    }

    /**
     * 修改供应商
     * @param
     * @return
     */
    @RequestMapping("/update_supplier")// 注意@ResponseBody就是写在这个位置
    @ResponseBody
    public Msg updateSupplier(@RequestParam("add") String add,@RequestParam("supplierId") String supplierId , HttpSession httpSession) {
        String sellerId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(sellerId);
        System.out.println("store_id"+store_id);
        JSONObject json_test = JSONObject.fromObject(add);
        Supplier supplier = new Supplier();
        supplier.setSupplierName(json_test.getString("supplierName"));
        supplier.setSupplierContacts(json_test.getString("supplierContacts"));
        supplier.setSupplierWx(json_test.getString("supplierWx"));
        supplier.setSupplierEpay(json_test.getString("supplierEpay"));
        supplier.setSupplierPhone(json_test.getString("supplierPhone"));
        supplier.setSupplierMemo(json_test.getString("supplierMemo"));
        if(supplierId==null||supplierId==""){
            System.out.println("没有id");
            supplier.setSupplierId((int)(Math.random() * 10000));
            supplier.setStoreId(store_id);
            supplierService.add_supplier(supplier);
        }
        else {
            System.out.println("有id");
            supplier.setSupplierId(Integer.parseInt(supplierId));
            supplierService.updateSupplier(supplier);
        }
        return Msg.success();
    }

    /**
     * 根据Id查询供应商
     * @param id
     * @return
     */
    @RequestMapping(value = "/select_supplier/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeller(@PathVariable("id") String id){
        System.out.println(id);
        int supplierId = Integer.parseInt(id);
        Supplier supplier = supplierService.getSupplier(supplierId);
        return Msg.success().add("supplier",supplier);
    }

    /**
     * 根据storeId查询所有供应商
     * @param id
     * @return
     */
    @RequestMapping("/select_supplier_storeId")// 注意@ResponseBody就是写在这个位置
    @ResponseBody
    public List<Supplier> fenlei(@RequestParam("id") int id) {
        List<Seller> stores = sellerService.findStoreId(id);
        int store_id =stores.get(0).getStoreId();
        System.out.println("获取供应商中...");
        //通过id获取店铺id
        JSON json1=null;
        //后台代码返回sortid和sortname
        List<Supplier> suppliers= supplierService.select_supplier_storeId(store_id);
        return suppliers;
    }

}
