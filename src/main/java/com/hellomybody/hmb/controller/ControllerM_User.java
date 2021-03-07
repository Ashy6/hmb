package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.M_User;
import com.hellomybody.hmb.dao.Dao_U_Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
@RestController
public class ControllerM_User {
    @Autowired    //自动注解daomenu，引入
    private Dao_U_Menu dao_u_menu;
    @RequestMapping("/usermenus")           //  放置路由地址
    public String getuserAllMenus(){
        System.out.println("用户功能加载完毕");
//        这里的数据使用一个哈希map，键是string，值是object
        HashMap<String,Object> data = new HashMap<>();          //map中放的内容：查询结果+标识
        List<M_User> usermenus = dao_u_menu.getUserMenus();   //引入Dao_U_Menu ， 数据从Dao_U_Menu中查询出来
//        map中放查询的结果  还有表标识flag
        if (usermenus!=null){                //值不为空
            data.put("usermenus",usermenus);    //flag数据 menus
            data.put("flag",666);
        }else {
            data.put("flag",3184);    //成功是666  失败是3184
        }
//        json转换字符信息
        String a = JSON.toJSONString(data);
        System.out.println(a);
        return a;
    }
}
