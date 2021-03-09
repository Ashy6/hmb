package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.QueryInfo;
import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.bean.UserBody;
import com.hellomybody.hmb.dao.DaoUserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerUserBody {
    @Autowired
    private DaoUserBody daoub;

    // 用户添加信息
    @RequestMapping("/addUserBody")
    public String addUserInfo(@RequestBody UserBody userBody){
        int ui = daoub.addUserBody(userBody);
        System.out.println("用户数据："+ui);
        return ui > 0 ? "success" : "error";
    }
    // 查询用户信息
    @RequestMapping("/findUserBody")
    public String getUserBodyMassage(String username){
        UserBody user = daoub.getUserBodyMassage(username);
        String res = JSON.toJSONString(user);
//            System.out.println(res);
        return res;
    }

    //    查询全部历史记录
    @RequestMapping("/findBodyList")
    public String getUserHWList(QueryInfo queryInfo, String username){
        //        获取查询信息和当前编号  存储到 numbers中
        int numbers = daoub.getUserBDCounts("%"+queryInfo.getQuery()+"%");
        System.out.println("用户身体记录数目"+numbers);
        int pageStart = (queryInfo.getPageNum() - 1) *queryInfo.getPageSize();
        List<UserBody> users = daoub.getBDMessage( username);
        /*   创建hashmap  用于存放结果 */
        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);         //最大页
        res.put("data",users);              //结果
        String hw = JSON.toJSONString(res);
        System.out.println(hw);
        return hw;
    }
    //    删除的方法
    @RequestMapping("/deleteRecord")
    public String deleteRecord(int id){
        int i = daoub.deleteRecord(id);
        return i > 0 ? "success":"error";
    }
}
