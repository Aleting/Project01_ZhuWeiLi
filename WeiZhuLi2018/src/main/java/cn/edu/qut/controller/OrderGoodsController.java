package cn.edu.qut.controller;


import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Orde;
import cn.edu.qut.entity.Order_goods;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.service.OrderService;
import cn.edu.qut.service.SellerService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Order_Goods")
@ResponseBody
public class OrderGoodsController {

    @Autowired
    OrderService orderService;
    @Autowired
    SellerService sellerService;
    /**
     * 查出商品信息
     */
    @RequiresPermissions("order:select")
    @RequestMapping("select_order")
    public Msg select_order(){

        List<Order> orders = orderService.select_order();
        return Msg.success();
    }

    /**
     * 添加订单
     */
    @RequestMapping("/add_order")
    @ResponseBody
    public Msg addGoods(@RequestParam("Form") String Form,@RequestParam("Table") String Table,HttpSession httpSession){
        System.out.println(Form);
        System.out.println(Table);
        String sellerId=(String) httpSession.getAttribute("sellerId");
        int store_id = Integer.parseInt(sellerId);
        List<Seller> stores = sellerService.findStoreId(store_id);
        int storeId =stores.get(0).getStoreId();
        JSONObject json_test = JSONObject.fromObject(Form);
        Orde orders = new Orde();
        orders.setOrderId((int)(Math.random() * 10000));
        orders.setOrderNumber((int)(Math.random() * 10000000));
        orders.setOrderTime(new Date());
 //       orders.setOrderMoney(Float.parseFloat(json_test.getString("orderMoney")));
        if(json_test.has("已付款")){
            orders.setOrderState("1");
        }
        else{
            orders.setOrderState("0");
        }
        orders.setCustomerId(json_test.getInt("customerId"));
        orders.setAddress(json_test.getString("收货人")+" "+json_test.getString("收货人电话")+" "+json_test.getString("收货地址"));
        orders.setStoreId(storeId);
        orders.setSellerId(store_id);
        orders.setOrderEpayTime(new Date());
        orderService.addOrder(orders);
        JSONArray json = JSONArray.fromObject(Table);
        if(json.size()>0) {
            for (int i = 0; i < json.size(); i++) {

                JSONObject job = json.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                Order_goods order_goods = new Order_goods();
                order_goods.setOrderGoodsId((int)(Math.random()*10000));
                order_goods.setGoodsId((int)(Math.random() * 10000));
                order_goods.setOrderId(orders.getOrderId());
                order_goods.setGoodsId(job.getInt("goodsId"));
                order_goods.setGoodsPrice(new BigDecimal(job.getString("attributePrice")));
                order_goods.setGoodsState("1");
                order_goods.setGoodsNum(Integer.parseInt(job.get("goodsNum").toString()));
                order_goods.setCustomerId(orders.getCustomerId());
                order_goods.setStoreId(storeId);
                order_goods.setAttribute(job.getString("attributeId"));
                order_goods.setOrderEpayTime(new Date());
                orderService.addOrderGoods(order_goods);
            }
        }
        return Msg.success();
    }

}
