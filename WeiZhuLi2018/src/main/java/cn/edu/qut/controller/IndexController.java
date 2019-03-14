package cn.edu.qut.controller;

import cn.edu.qut.service.AccessService;
import cn.edu.qut.service.StoreService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class IndexController {

    @Autowired
    StoreService stroeService;
    @Autowired
    AccessService accessService;
//  进入后台首页
    @RequestMapping("/shopowner")
    public  String login_shopowner(Model model){
        long count = stroeService.select_store();
        long count_access=accessService.select_num();
        model.addAttribute("store_num",count);
        model.addAttribute("access_num",count_access);
        return "main管理员";
    }
//  进入店员管理
    @RequestMapping("/shopassistant")
    public String shop_assistant(){return "店主商品管理";}
//  进入注册页面
    @RequestMapping("/register")
    public String register(){return "register";}
//  进入店员管理页面
    @RequestMapping("/addCustomer")
    public String addCustomer(){return "店主客户添加";}
//  进入店铺基本信息修改
    @RequestMapping("/management")
    public String management(){return "添加店铺";}
//  供应商管理
    @RequiresPermissions("supplier:list")
    @RequestMapping("/supplier")
    public String supplier(){return "供应商测试";}
//  客户管理
    @RequestMapping("/management_cus")
    public String management_cus(){return "查询修改客户";}
//  订单管理
    @RequestMapping("/management_order")
    public String management_order(){return "订单详情(店员)";}
//  订单审核
    @RequestMapping("/order_audit")
    public String order_audit(){return "订单审核";}
//  订单录入
    @RequestMapping("/order_entry")
    public String order_entry(HttpServletRequest req,Model model){
        String sellerId = req.getParameter("sellerId");
        model.addAttribute(sellerId);
        return "订单录入";}
//  进货管理
    @RequestMapping("/management_stock")
    public  String management_stock(){return "进货单信息列表";}
//   管理员的店铺查看及修改
    @RequestMapping("/admin_shop")
    public String admin_shop(){return "管理员的店铺查看及修改";}
//   管理员续费审核
    @RequestMapping("/admin_renewal")
    public String admmin_renewal(){return "管理员续费审核";}
//    平台流量
    @RequestMapping("/platform")
    public String platform(){return "平台流量";}
//    进入个人信息修改
    @RequestMapping("/person_info")
    public String person_info(){return "个人信息修改";}
//    进入授予授予权限页面
    @RequestMapping("/grant_permission")
    public String grant_permission(){return "clerk-permission";}
//    进入开店页面
    @RequestMapping("/start")
    public String start(){return "start";}
    //进入续费页面
    @RequestMapping("/renew")
    public String renew(){return "续费界面";}
    @RequestMapping("/ceshi")
    public String ceshi(){return "店员管理";}

    @RequestMapping("/success")
    public String Success(){return "success";}
}
