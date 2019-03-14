package cn.edu.qut.controller;


import cn.edu.qut.entity.CommodityManagement;
import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.service.CommodityManagementService;
import cn.edu.qut.service.SellerService;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cmc")
@SessionAttributes("cmc")
public class CommodityManagementController {
    @Autowired
    CommodityManagementService commodityManagementService;
    @Autowired
    SellerService sellerService;

    /**
   客户查询*/
    @RequestMapping("/select_goods")
    public @ResponseBody
    JSON selectcm(int page, int limit, String goodsId, String goodsName, String sort, HttpSession httpSession) {
        String sellerId = (String) httpSession.getAttribute("sellerId");
        int id = Integer.parseInt(sellerId);
        List<Seller> stores = sellerService.findStoreId(id);
        int store_id = stores.get(0).getStoreId();
        JSON json1 = null;
        int flag1 = 0, flag2 = 0, flag3 = 0;
        if (goodsId == "" || goodsId == null) {
            flag1 = 1;
        }
        if (goodsName == "" || goodsName == null) {
            flag2 = 2;
        }
        if (sort==null||sort == "") {
            flag3 = 3;
        }
        System.out.println("flag1"+flag1+"flag1"+flag2+"flag1"+flag3);
        int count = commodityManagementService.count(store_id);
        if (flag1 == 1 && flag2 == 2 && flag3 == 3) {
            List<CommodityManagement> eilist = commodityManagementService.findAllPage(store_id, (page - 1) * 5);
            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        } else if (flag3 != 3) {
            int sortId = Integer.parseInt(sort);
            List<CommodityManagement> eilist1 = commodityManagementService.selectSortId(sortId, store_id,(page - 1) * 5);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js + "}";
            json1 = (JSON) JSON.parse(jso);
        } else if (flag1 != 1) {
            int goods_id = Integer.parseInt(goodsId);
            CommodityManagement eilist1 = commodityManagementService.selectGoodsId(goods_id, store_id);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js + "}";
            json1 = (JSON) JSON.parse(jso);
        } else {
            System.out.println(goodsName);
            List<CommodityManagement> eilist1 = commodityManagementService.selectGoodsName(goodsName, store_id);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js + "}";
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
        }
            return json1;
        }


    /**导出excel
     *
     * @param response
     * @return
     */
    @RequestMapping("/feeList")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody String export(HttpServletResponse response,HttpSession httpSession){
        String sellerId=(String) httpSession.getAttribute("sellerId");
        int id = Integer.parseInt(sellerId);
        List<Seller> stores = sellerService.findStoreId(id);
        String store_id =stores.get(0).getStoreId().toString();
        System.out.println(1);
        response.setContentType("application/binary;charset=UTF-8");
        try{
            ServletOutputStream out=response.getOutputStream();
            String fileName=new String(("CostInfo "+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            String[] titles = { "商品名称", "商品售价", "商品VIP价", "商品进价","供应商", "状态"};
            System.out.println("导出中excel....");
            commodityManagementService.export(titles, out,store_id);
            System.out.println("导出出现错误！");
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }


    /**
     * 上传图片
     * @param servletRequest
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping("upload_images")
    public Map<String,Object> upload(HttpServletRequest servletRequest, @RequestParam("file") MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            //上传文件的路径
            String path = "../../../webapp/static/image";
            System.out.println("文件名称为："+file.getOriginalFilename());
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath  = new File(path,filename);


            //判断路径是否存在，没有就创建一个
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }

            //将上传文件保存到一个目标文档中
            File file1 = new File(path+File.separator+filename);
            file.transferTo(file1);
            Map<String,Object> res = new HashMap<String,Object>();
            //返回一个url对象
            res.put("url",file1);
            return res;
        }
        else{
            Map<String,Object> res = new HashMap<String,Object>();
            //返回一个url对象
            res.put("url","错误");
            return res;
        }
    }

    /**
     * 根据Id查询商品
     * @param id
     * @return
     */
    @RequestMapping(value = "/select_goods/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeller(@PathVariable("id") String id){
        int goodsId = Integer.parseInt(id);
        CommodityManagement commodityManagement = commodityManagementService.getGoods(goodsId);
        return Msg.success().add("commodityManagement",commodityManagement);
    }


}
