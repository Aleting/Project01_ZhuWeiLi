package cn.edu.qut.controller;

import cn.edu.qut.entity.Attribute;
import cn.edu.qut.entity.Goods;
import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.service.AttributeService;
import cn.edu.qut.service.GoodService;
import cn.edu.qut.service.SellerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodService goodService;
    @Autowired
    AttributeService attributeService;
    @Autowired
    SellerService sellerService;

    @RequestMapping("/goods_info")
    @ResponseBody
    public Msg getCustomersWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Goods> goods = goodService.all_goods();
        PageInfo pageInfo_goods = new PageInfo(goods, 5);
        return Msg.success().add("pageInfo_goods",pageInfo_goods);
    }
/**
 * 添加商品
 */
    @RequestMapping("/add_goods")
    @ResponseBody
    public Msg addGoods(@RequestParam("add") String add, @RequestParam("goodsId") String goodsId,@RequestParam("attributeId") String attributeId, HttpSession httpSession){
        String sellerId=(String) httpSession.getAttribute("sellerId");
        int store_id = Integer.parseInt(sellerId);
        List<Seller> stores = sellerService.findStoreId(store_id);
        int storeId =stores.get(0).getStoreId();

        System.out.println("goodsId"+goodsId+" "+storeId);
        JSONObject json_test = JSONObject.fromObject(add);
        Goods goods = new Goods();
        goods.setGoodsImg1(json_test.getString("goodsImg"));
//        goods.setGoodsImg2(json_test.getString("goodsImg2"));
//        goods.setGoodsImg3(json_test.getString("goodsImg3"));
        goods.setGoodsName(json_test.getString("goodsName"));
        goods.setSortId(Integer.parseInt(json_test.getString("sortId")));
        goods.setGoodsContent(json_test.getString("goodsContent"));
        goods.setVirtualId(json_test.getInt("goodsVid"));

        if (json_test.has("goodsState")==true){
            goods.setGoodsState("1");
        }

        else {
            goods.setGoodsState("0");
        }
        goods.setStartTime(new Date());
        goods.setSupplierId(json_test.getInt("supplierId"));
        Attribute attribute = new Attribute();
//        String str[] = {"L","XL","XXL","红色","橙色","黄色","绿色","青色","蓝色","紫色"};
        String s = "";
//        for(int i=0;i<str.length;i++){
//            if(json_test.has(str[i])){
//                s += str[i]+" ";
//            }
//        }
//        System.out.println("顺利执行2！");
        if(json_test.has("goodsElse")==true){
            s += json_test.getString("goodsElse");
        }
        attribute.setAttributeSize(s);
        attribute.setAttributePrice0(new BigDecimal(json_test.getString("attributePrice0")));
        attribute.setAttributePrice(new BigDecimal(json_test.getString("attributePrice")));
        attribute.setAttributePriceVip(new BigDecimal(json_test.getString("attributePrice")));
        attribute.setAttributePriceAgent(new BigDecimal(json_test.getString("attributePrice")));
        attribute.setAttributeMemo(json_test.getString("attributeMemo"));
    //    attribute.setAttributeRepertory(json_test.getInt("attributeRepertory"));
        attribute.setAttributeName(goods.getGoodsName());
        int goods_id=Integer.parseInt(goodsId);
        if(goods_id == -1){
            goods.setGoodsId((int)(Math.random() * 10000));
            attribute.setGoodsId(goods.getGoodsId());
            attribute.setAttributeId((int)(Math.random()*10000));
            goods.setStoreId(storeId);
            goodService.addGoods(goods);
            attributeService.addAttribute(attribute);
        }
        else {
            System.out.println("有id");
            goods.setGoodsId(Integer.parseInt(goodsId));
            goodService.updateGoods(goods);
            attribute.setAttributeId(Integer.parseInt(attributeId));
            attributeService.updataAttribute(attribute);
        }
        System.out.println("执行完成！");
        return Msg.success();
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @RequestMapping("/delete_goods")
    public @ResponseBody Msg delectGoods(String id){
        System.out.println("delect——goods被调用");
        int goods_id = Integer.parseInt(id);
        attributeService.deleteAttribute(goods_id);
        goodService.deleteGoods(goods_id);
        return Msg.success();
    }

    /**
     * 修改商品状态
     */

    @RequestMapping("/updata_goodsState")// 注意@ResponseBody就是写在这个位置
    public @ResponseBody Msg updata_goodsState(@RequestParam("id") String id,@RequestParam("check") String check){
        System.out.println("id"+id+"check"+check);
        if(check.equals("true")){
            check="1";
        }
        else {
            check="0";
        }
        int go_id = Integer.parseInt(id);
        goodService.updataGoodsState(go_id,check);
        System.out.println("执行完成！");
        return Msg.success();
    }
}
