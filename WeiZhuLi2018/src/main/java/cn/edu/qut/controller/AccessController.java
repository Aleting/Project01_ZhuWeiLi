package cn.edu.qut.controller;

import cn.edu.qut.entity.Access;
import cn.edu.qut.entity.Msg;
import cn.edu.qut.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/access")
public class AccessController {

    @Autowired
    AccessService accessService;
    /**
     * 平台流量 将数据存入数据库
     * 并将数量返回给前端
     * @param name
     * @param
     * @param access_time
     * @return
     */
    @RequestMapping("/cord")
    @ResponseBody
    public Msg access_cord(@RequestParam("name")String name,@RequestParam("access_time")Date access_time){
        Access access = new Access();
        access.setCustomerName(name);
        access.setAccessData(access_time);
        accessService.access_cord(access);
        int count = accessService.select_num();
        System.out.println(count+"进入access");
        return Msg.success().add("count",count);
    }
}
