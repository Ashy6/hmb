package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.dao.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController  //该注解规定所有的controller都是string类型
public class ControllerLogin {
    @Autowired  //该注解将Daouser注入到controllerLogin中
    private DaoUser daoUser;
    @RequestMapping("/login")    //该注解创建访问路径
    public String login(@RequestBody User user) {  //Req注解让其可以找到参数user
        User u = daoUser.getUserByMassage(user.getUsername(),user.getPassword());
        System.out.println("user:"+u);    //输出当前user
//        初始信息 flag
        String flag = "error";
//       创建map存放查询出的user和flag，转化json字符串，返回在pom.xml里添加json依赖,使用JSON.toJSONString转化对象为json
       HashMap<String,Object> res = new HashMap<>();
        if (u!=null){
            flag = "ok";  //如果不为空，则有结果，则先赋值ok
        }
//        在res中添加信息 flag 和 user-
        res.put("flag",flag);
        res.put("user",user);
//        System.out.println("用户登录完成");
//        json字符串，可以转换对象的信息为字符信息
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
