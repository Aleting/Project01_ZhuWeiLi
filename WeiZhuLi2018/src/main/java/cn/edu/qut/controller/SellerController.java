package cn.edu.qut.controller;


import cn.edu.qut.entity.*;
import cn.edu.qut.service.CostService;
import cn.edu.qut.service.SellerService;
import cn.edu.qut.service.StoreService;
import cn.edu.qut.tools.MD5Tool;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class SellerController {

    @Autowired
    SellerService sellerService;
    @Autowired
    StoreService storeService;
    @Autowired
    CostService costService;
    @RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req){
		String error=null;
		String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
            System.out.println("error"+error);
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
            System.out.println("error"+error);
        } else if(ExcessiveAttemptsException.class.getName().equals(exceptionClassName)) {
            error = "登陆太过频繁，请稍后重试";
            System.out.println("error"+error);
        }else if(exceptionClassName != null) {
        	System.out.println(exceptionClassName);
            error = "其他错误：" + exceptionClassName;
            System.out.println("error"+error);
        }
        /*else if(exceptionClassName==null){
        	//当前用户凭证
    		Seller principal = (Seller)SecurityUtils.getSubject().getPrincipal();
    		System.out.println(principal);
        	ModelAndView mav=new ModelAndView("index管理员");
            //mav.addObject("error", error);
    		return mav;
        }*/
        
        ModelAndView mav=new ModelAndView("login");
        mav.addObject("error", error);
		return mav;
        //return "login";
	}

    /**
     * 登陆功能
     * 获取店铺数量
     * @param seller
     * @param model
     * @return
     */
    @RequestMapping("/checklogin")
    public String checklogin(Seller seller, Model model) {
        List<Seller> sellerList = sellerService.checklogin(seller.getSellerLoginName(), seller.getSellerPassword());
        System.out.println(sellerList.toString());
        if (sellerList.size() >0) {
            model.addAttribute("seller",sellerList.get(0));
            return "index管理员";
        } else {
            return "false";
        }

    }
    
    //    yp add 20181109 test
    @RequestMapping("/admin")
    public String admin() {
    	//当前用户凭证
		Seller principal = (Seller)SecurityUtils.getSubject().getPrincipal();
		System.out.println("拿取用户凭证"+principal);
            return "index管理员";

    }
    
	//  yp add 20181109 test
    
      @RequiresPermissions("test:test")
	  @RequestMapping("/admin2")
	  public String admin2(Model model) {
	  	//当前用户凭证
			Seller principal = (Seller)SecurityUtils.getSubject().getPrincipal();
			List<Seller> sellerList = sellerService.getsel(principal.getSellerId());
			model.addAttribute("seller",sellerList.get(0));
			System.out.println("拿取用户凭证"+principal);
	          return "index管理员";
	
	  }
    
    /**
     * 检查旧密码功能 需要前台传数据 失去焦点事件绑定
     */
    @RequestMapping("/check_old")
    @ResponseBody
    public Msg check_old(@RequestParam(value = "information",required = false) String information){
        System.out.println("进入check_old");
        /**
         * 这里需要获取前台的用户名和密码
         */
        JSONObject info = JSONObject.fromObject(information);
        /**
         * 这里接收前台发来的id用来检查密码
         * 测试数据
         */
        int Sellerid= 10001;
        String password = "12345678";

        boolean is_succ = sellerService.check_old(Sellerid,password);

        if(is_succ){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }
    /**
     * 修改密码功能 需要前台传入新密码
     */
    @RequestMapping("update_newpassword")
    @ResponseBody
    public Msg update_password(@RequestParam(value = "information",required = false) String information){
        System.out.println("进入update_password");
        /**
         * 接收前台发来的新密码数据
         */
        JSONObject info = JSONObject.fromObject(information);
        /**
         * 测试
         */
        int SellerId = 1;
        String new_password = "123456";

        sellerService.update_password(SellerId,new_password);

            return Msg.success();

    }

    /**
     * 修改密码功能
     */
    @RequestMapping("update_password")
    public String update_password(Model model){
        return "sellerPassword";
    }

    /**
     * 店主个人信息修改
     */
    @RequestMapping("/update_person")
    @ResponseBody
    public Msg Update_Seller(@RequestParam("person") String person,@RequestParam("id") int id){
        System.out.println("进入update_person");
        JSONObject person_info = JSONObject.fromObject(person);
        /**
         * 这里写从前端获取的数据
         */
        Seller seller = new Seller();
        /**
         * 测试数据
         */

        seller.setSellerId(id);
        seller.setSellerLoginName((String) person_info.get("customerLoginName"));
        seller.setSellerPhone((String) person_info.get("customerPhone"));
        seller.setSellerEpay((String) person_info.get("customerEpay"));
        seller.setSellerImg(person_info.getString("sellerImg"));
        sellerService.update_seller(seller);
        return Msg.success();
    }
    /**
     * 根据ID查询Seller信息
     */
    @RequestMapping(value = "/seller/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getSeller(@PathVariable("id") Integer id){
        System.out.println(id);
        List<Seller> seller = sellerService.getsel(id);

        return Msg.success().add("seller",seller);
    }

    /**
     * 注册功能+邮箱发送(基于163邮箱的smtp协议）
     */

    //@RequestParam(value="add", required = false) String add
    @RequestMapping("/seller_register")
    public @ResponseBody String register(@RequestParam("add") String add) {
        //System.out.println(add);
        Store store = new Store();
        store.setStoreId((int)(Math.random()*10000));
        store.setStoreState("1");
        store.setStoreStartTime(new Date());
        storeService.creatStore(store);
        JSONObject json_test = JSONObject.fromObject(add);
        //System.out.println(json_test.get("Seller_login_name"));
        Seller seller = new Seller();
        seller.setSellerId((int)(Math.random()*10000));
        seller.setSellerRealName((String) json_test.get("seller_real_name"));
        seller.setSellerLoginName((String) json_test.get("seller_login_name"));
        Object sellerPassWord = MD5Tool.getPassword(((String) json_test.get("seller_password")));
        seller.setSellerPassword(sellerPassWord.toString());
        seller.setSellerMailbox((String) json_test.get("seller_mailbox"));
        seller.setSellerRegDate(new Date());
        SendMail sendMail = new SendMail();
        seller.setStoreId(store.getStoreId());
        System.out.println(store.getStoreId());
        String code = sendMail.getCode(30);
        seller.setSellerState(code);
        //没有随机生成客户ID，但是ID为主键
        seller.setRoleId(2);
        System.out.println(seller.getSellerMailbox());
        boolean register = sellerService.register(seller);
        Cost cost = new Cost();
        cost.setCostId((int)(Math.random()*10000));
        cost.setStoreId(store.getStoreId());
        cost.setMoney(0);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DAY_OF_MONTH,20);
        Date date1 = calendar.getTime();
        cost.setRenewalDate(date1);
        cost.setPayment("1");
        costService.insertCost(cost);

        try {
            boolean flag = sendMail.sendMail(seller.getSellerLoginName(), seller.getSellerMailbox(), code);
            if (register && flag) {
                System.out.println("ok");

                return "login";
            } else{
                //System.out.println(register+"  "+flog);
                return "register";
            }
        } catch(Exception e) {
            e.printStackTrace();
            return "false";
        }

    }
    /**
     * 邮箱反馈
     */
    @RequestMapping("/success")
    public String selectRegister(@RequestParam(value="sellerLoginName")String sellerLoginName, @RequestParam(value="sellerState") String sellerState){
        System.out.println(sellerLoginName+"  "+sellerState);
        boolean flog = sellerService.selectRegister(sellerLoginName,sellerState);
        System.out.println(flog);
        if(flog){
            return "success";
        }
        else {
            return "false";
        }
    }

    /**
     用id查seller
     */
    @RequestMapping("/select_seller")
    public @ResponseBody
    JSON selectSeller(int page, int limit, String id, HttpSession httpSession){
        JSON json1 = null;
        String storeId=(String) httpSession.getAttribute("storeId");
        int store_id = Integer.parseInt(storeId);

        int count = sellerService.count(store_id);
        if(id==null||id=="") {

            System.out.println("if");
            List<Seller> eilist = sellerService.findAllPage(store_id,(page - 1) * 5);
            JSONArray json = JSONArray.fromObject(eilist);
            String js1 = json.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + js1 + "}";//转为layui需要的json格式
            System.out.println(jso);
            json1 = (JSON) JSON.parse(jso);
            return json1;
        }
        else{
            //System.out.println(order_id);
            int sellerId = Integer.parseInt(id);
            Seller eilist1 = sellerService.selectId(store_id,sellerId);
            JSONArray json2 = JSONArray.fromObject(eilist1);
            String js = json2.toString();
            String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";
            json1= (JSON) JSON.parse(jso);
            return json1;
        }

    }

    /**
     * 根据用户名查重
     * @param name
     * @return
     */
    @RequestMapping(value = "/select_name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public int getSeller(@PathVariable("name") String name){
        System.out.println("hanshuzhix");
        List<Seller> sellerList = sellerService.checkName(name);
        if(sellerList.size()>0){
            return 0;
        }
        else {
            return 1;
        }
    }

    /**
     * 返回店主
     */
    @RequestMapping(value = "/seller_name", method = RequestMethod.GET)
    @ResponseBody
    public Msg selectStoreBoss(HttpSession httpSession){
        System.out.println("返回店主！");
        String storeId = (String) httpSession.getAttribute("storeId");
        List<Seller> StoreBoss = sellerService.selectStoreBoss(Integer.parseInt(storeId),2);
        System.out.println("StoreBoss"+StoreBoss.get(0).getSellerLoginName());
        return Msg.success().add("name",StoreBoss);
    }

    /**
     * 根据Id查询状态
     * @param id
     * @return
     */
    @RequestMapping(value = "/select_seller_state/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getSeller2(@PathVariable("id") String id){
        System.out.println("函数调用"+id);
        List<Seller> sellers=sellerService.checkName(id);
        String seller2=sellers.get(0).getSellerState();
        System.out.println("函数调用2"+seller2);
        return seller2;
    }
}


