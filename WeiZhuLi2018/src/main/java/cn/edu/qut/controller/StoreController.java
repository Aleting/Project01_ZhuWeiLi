package cn.edu.qut.controller;


import cn.edu.qut.entity.*;
import cn.edu.qut.service.StoreService;
import net.sf.json.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 店铺操作
 */
@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @RequiresPermissions("store:index")
    @RequestMapping("/select_store")
    public String select_store(Model model){

        return "main管理员";
    }
    /**
     * 店铺基本信息回传给首页 需要前台传数据店铺名称和解析json数据回显
     * @RequestParam("store_name")
     */
    @RequiresPermissions("store:info")
    @RequestMapping("/store_info")
    @ResponseBody
    public Msg store_select(String store_name){
        /**
         * 测试数据 store_name1
         */
        String store_name1 = "助微力官方旗舰店";
        List<Store> store = storeService.store_info(store_name1);
        return Msg.success().add("store_info",store);
    }
    /**
     * 修改店铺信息 前端未传店铺信息表单
     * 传之后用@RequestParam("store_info")来接收update后的店铺信息
     * 用url来接收store_id @RequestParam("id")
     */
    @RequiresPermissions("store:update")
    @RequestMapping("/store_update")
    @ResponseBody
    public Msg Update_store(){
        System.out.println("进入store_update");
        //JSONObject person_info = JSONObject.fromObject(store_info); 来接收前台数据的
        /**
         * 这里写从前端获取的数据
         */
        Store store = new Store();
        /**
         * 测试数据
         */
        // 接收id值 不发生改变

        store.setStoreId(1);
        store.setStoreName("无尽良品");
        store.setStoreImg("2018-05-072Az3m.png");
        store.setStoreContent("服务内容");
        store.setStoreState("1");
        store.setStoreStartTime(new Date());
        store.setStoreStartTime(new Date());

        storeService.update_store(store);
        return Msg.success();
    }

    /**
     * 修改店铺
     */

    @RequestMapping("/updateStore")
    @ResponseBody
    public Msg updateStore(@RequestParam("add") String add , HttpSession httpSession){
        System.out.println("函数调用中");
        String storeId = (String) httpSession.getAttribute("storeId");
        JSONObject json_test = JSONObject.fromObject(add);
        Store store = new Store();
        store.setStoreName(json_test.getString("storeName"));
        store.setStoreContent(json_test.getString("storeContent"));
        store.setTypeId(json_test.getInt("sortId"));

        store.setStoreId(Integer.parseInt(storeId));
        storeService.update_store(store);
        return Msg.success();
    }

    /**
     * 根据store_id查询
     */

    @RequestMapping(value = "/select_store_id", method = RequestMethod.GET)
    @ResponseBody
    public Msg select_store_id(HttpSession httpSession){
        String storeId = (String) httpSession.getAttribute("storeId");
        System.out.println("storeId"+storeId);
        Store store = storeService.select_store_id(Integer.parseInt(storeId));
        Date date = store.getStoreStartTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        store.setStoreImg(str);
        return Msg.success().add("store",store);
    }

    @RequestMapping("/select_all_type")
    @ResponseBody
    public List<Type> fenlei() {
        System.out.println("函数被执行！");
        return storeService.selectAllType();
    }

}
