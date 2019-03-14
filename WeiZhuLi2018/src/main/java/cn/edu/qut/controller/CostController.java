package cn.edu.qut.controller;

import cn.edu.qut.entity.Cost;
import cn.edu.qut.entity.Msg;
import cn.edu.qut.service.CostService;
import cn.edu.qut.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 分页
 * 处理顾客增删改查
 */
@Controller
@RequestMapping("/cost")
public class CostController {

    @Autowired
    StoreService storeService;
    @Autowired
    CostService costService;

    /**
     * 添加客户功能
     * 需要前台传ajax表格数据
     * @RequestParam("add")
     * @return
     */
    @RequestMapping(value = "/select_cost", method = RequestMethod.GET)
    @ResponseBody
    public Msg select_cost(HttpSession httpSession){
        String storeId = (String) httpSession.getAttribute("storeId");
        List<Cost> cost = costService.select_cost(Integer.parseInt(storeId));
        Date date = cost.get(0).getRenewalDate();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = format.format(date);
        cost.get(0).setPayment(str);
        System.out.println("函数执行结束！");
        return Msg.success().add("cost",cost);
    }


    @RequestMapping("/addcost")
    @ResponseBody
    public Msg addCost(@RequestParam("endTime") String endTime , @RequestParam("money") String money ,@RequestParam("type") String type ,HttpSession httpSession) throws ParseException {
        System.out.println("函数执行！"+endTime+""+money+""+type);
        String storeId = (String) httpSession.getAttribute("storeId");
        Cost cost = new Cost();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        将字符串转成日期
        Date date = sf.parse(endTime);
        cost.setRenewalDate(date);
        cost.setMoney(Integer.parseInt(money));
        cost.setPayment(type);
        costService.addCost(cost,Integer.parseInt(storeId));
        return Msg.success();
    }

}