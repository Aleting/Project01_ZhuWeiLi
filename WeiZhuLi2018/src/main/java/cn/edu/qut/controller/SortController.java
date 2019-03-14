package cn.edu.qut.controller;


import cn.edu.qut.entity.Msg;
import cn.edu.qut.entity.Seller;
import cn.edu.qut.entity.Sort;
import cn.edu.qut.service.SellerService;
import cn.edu.qut.service.SortService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/sort")
public class SortController {
    @Autowired
    SortService sortService;
    @Autowired
    SellerService sellerService;
    @RequestMapping("/order_fenlei")
    @ResponseBody
    public List<Sort> fenlei(@RequestParam("id") int id) {
        List<Seller> stores = sellerService.findStoreId(id);
        int store_id =stores.get(0).getStoreId();
        System.out.println("获取分类中...");
        //通过id获取店铺id
        //后台代码返回sortid和sortname
        List<Sort> sorts= sortService.select_sort(store_id);
        return sorts;
    }

    @RequestMapping("/add_sort")
    @ResponseBody
    public Msg addSort(@RequestParam("sortName") String sortName, HttpSession httpSession){
        JSONObject json_test = JSONObject.fromObject(sortName);
        String sellerId=(String) httpSession.getAttribute("sellerId");
        int id = Integer.parseInt(sellerId);
        List<Seller> stores = sellerService.findStoreId(id);
        int store_id =stores.get(0).getStoreId();
        Sort sort = new Sort();
        sort.setSortId((int)(Math.random()*10000));
        sort.setSortName(json_test.getString("addSort"));

        sort.setStoreId(store_id);
        sort.setSortGrade("1");
        sort.setSortShow("1");
        sortService.addSort(sort);
        return Msg.success();
    }
}
