package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.MenuMain;
import com.hellomybody.hmb.dao.DaoMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerMenu {
    @Autowired    //自动注解daomenu，引入
    private DaoMenu daoMenu;
    @RequestMapping("/menus")           //  放置路由地址
    public String getAllMenus(){
//        这里的数据使用一个哈希map，键是string，值是object
        System.out.println("菜单成功访问");
        HashMap<String,Object> data = new HashMap<>();          //map中放的内容：查询结果+标识
        List<MenuMain> menus = daoMenu.getMenus();    //引入daoMenu ， 数据从daoMenu中查询出来
//        map中放查询的结果  还有表标识flag
        if (menus!=null){                //值不为空
            data.put("menus",menus);    //flag数据 menus
            data.put("flag",200);
        }else{
            data.put("flag",3184);    //成功是200  失败是3184
        }
//        json转换字符信息
        String s = JSON.toJSONString(data);
//        System.out.println(s);
        return s;
    }
}
