package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.UserInfo;
import com.hellomybody.hmb.dao.DaoUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerUserInfo {
    @Autowired    //自动注解daomenu，引入
            DaoUserInfo daoUserInfo;
    @RequestMapping("/userinfo")           //  放置路由地址
    public String getUserInfo(@RequestBody UserInfo userInfo){
//        这里的数据使用一个哈希map，键是string，值是object
        System.out.println("用户信息加载成功访");

//        UserInfo u = daoUserInfo.getUserInfoMassage(userInfo.getUsername());
//        HashMap<String,Object> data = new HashMap<>();          //map中放的内容：查询结果+标识
        List<UserInfo> userinfo = (List<UserInfo>) daoUserInfo.getUserInfoMassage(userInfo.getUsername());    //引入dao ， 数据从dao中查询出来
//        map中放查询的结果  还有表标识flag
        String flag = "error";
//       创建map存放查询出的user和flag，转化json字符串，返回在pom.xml里添加json依赖,使用JSON.toJSONString转化对象为json
        HashMap<String,Object> res = new HashMap<>();
//        map中放查询的结果  还有表标识flag
        if (daoUserInfo!=null){                //值不为空
            res.put("userinfo",daoUserInfo);    //flag数据 menus
            res.put("flag",666);
        }else {
            res.put("flag",3184);    //成功是666  失败是3184
        }
//        json转换字符信息
        String a = JSON.toJSONString(res);
        System.out.println(a);
        return a;

        //获取session
//        HttpSession session   =   request.getSession();
//// 获取session中所有的键值
//        Enumeration<String> attrs = session.getAttributeNames();
//// 遍历attrs中的
//        while(attrs.hasMoreElements()){
//// 获取session键值
//            String name = attrs.nextElement().toString();
//            // 根据键值取session中的值
//            Object vakue = session.getAttribute(name);
//            // 打印结果
//            System.out.println("------" + name + ":" + vakue +"--------\n");}
    }
}
