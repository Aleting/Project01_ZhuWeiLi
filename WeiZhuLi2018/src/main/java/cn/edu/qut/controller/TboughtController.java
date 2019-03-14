package cn.edu.qut.controller;


import cn.edu.qut.entity.T_bought;
import cn.edu.qut.service.TboughtService;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 进货单
 */
@Controller
@RequestMapping("/T_bought")
public class TboughtController {

    @Autowired
    TboughtService tboughtService;
    /**
     * 需要接收前台发来的ajax请求
     * @RequestParam("Tbought_info")
     * 其中进货单编号 自动编号bou+月+日+五位数字
     * 店铺编号 系统自动添加以当前登录的身份所在店铺为准
     * 店员编号 系统自动添加以当前登录的账号为准
     * @return
     */

    /**
     客户查询进货
     */
    @RequestMapping("/select_tBought")
    public @ResponseBody
    JSON selectb(int page, int limit, String id, HttpSession httpSession){
        String storeId=(String) httpSession.getAttribute("storeId");
        System.out.println("store"+storeId);
        JSON json1;
        int count = tboughtService.count(Integer.parseInt(storeId));
        if(id == null||id=="") {
            System.out.println("if");
            List<T_bought> eilist = tboughtService.findAllPage(Integer.parseInt(storeId),(page - 1) * 5);
            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        }
        else{
            //System.out.println(order_id);
            List<T_bought> eilist1 = tboughtService.selectId(Integer.parseInt(storeId),id);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
            json1= (JSON) JSON.parse(jso);
            return json1;
        }

    }
    /**
     导出excel表格
     */
    @RequestMapping("/feeList")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody String export(HttpServletResponse response, HttpSession httpSession){

        response.setContentType("application/binary;charset=UTF-8");
        String storeId=(String) httpSession.getAttribute("storeId");
        System.out.println("storeId"+storeId);
        try{
            ServletOutputStream out=response.getOutputStream();
            String fileName=new String(("CostInfo "+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            String[] titles = { "商品名", "供应商名称", "规格","进货价格", "数量"};
            tboughtService.export(titles, out, Integer.parseInt(storeId));
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }

/**
 * 更改支付状态
 */
//@RequestMapping("/ifPay")// 注意@ResponseBody就是写在这个位置
//public @ResponseBody Msg ifPay(@RequestParam("id") String id,@RequestParam("check") String check){
//    System.out.println("id"+id+"check"+check);
//    if(check.equals("true")){
//        check="1";
//    }
//    else {
//        check="0";
//    }
//    tboughtService.ifPay(id,check);
//    System.out.println("执行完成！");
//    return Msg.success();
//}

}
