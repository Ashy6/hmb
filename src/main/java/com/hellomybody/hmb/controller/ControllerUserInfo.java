package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.QueryInfo;
import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.bean.UserInfo;
import com.hellomybody.hmb.dao.DaoUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerUserInfo {
    @Autowired    //自动注解daomenu，引入
    private DaoUserInfo daoUserInfo;

    // 用户添加信息
    @RequestMapping("/addUserInfo")
    public String addUserInfo(@RequestBody UserInfo userInfo){
        // 这里解释一下，前端需要一个默认的生日，因为watch动态监听了用户birthday
        int ui = daoUserInfo.addUserInfo(userInfo);
        return ui > 0 ? "success" : "error";
    }
    // 注册用户实现用户信息表中用户生成
    // 同时也为添加用户信息的方法实现
    @RequestMapping("/addUserInfoName")
    public String addUserInfoName(@RequestBody UserInfo userInfo){
        // 这里解释一下，前端需要一个默认的生日，因为watch动态监听了用户birthday
        userInfo.setBirthday("2000-01-01");
        int ui = daoUserInfo.addUserInfoName(userInfo);
        return ui > 0 ? "success" : "error";
    }
    //    查询用户信息的方法
    @RequestMapping("/findUserInfo")
    public String getUserInfoMassage(String username){
        UserInfo user = daoUserInfo.getUserInfoMassage(username);
        String res = JSON.toJSONString(user);
        return res;
    }
    //    查询用户身高体重历史的方法  --  10条（分页没做）
    @RequestMapping("/findHWInfo")
    //    加载分页模型
    public String getUserHWList(QueryInfo queryInfo,String username){
        int numbers = daoUserInfo.getUserHWCounts(username);
        //        开始页面=（当前页的编号-1）*每页最大数
        int pageStart = (queryInfo.getPageNum() - 1) *queryInfo.getPageSize();
        List<User> users = daoUserInfo.getHWMessage( username,pageStart,queryInfo.getPageSize());
        /*   创建hashmap  用于存放结果 */
        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);         //最大页
        res.put("data",users);              //结果
        String hw = JSON.toJSONString(res);
        return hw;
    }
    //    查询用体脂历史
    @RequestMapping("/findInfoList")
    //    加载分页模型
    public String findInfoList(String username){
        System.out.println("用户记录查询完毕");
        int numbers = daoUserInfo.getInfoListCounts(username);
        List<User> users = daoUserInfo.findInfoList( username);
        /*   创建hashmap  用于存放结果 */
        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);              //结果
        String bmi = JSON.toJSONString(res);
        return bmi;
    }
    //    删除的方法
    @RequestMapping("/deleteInfo")
    public String deleteInfo(int id){
        int i = daoUserInfo.deleteInfo(id);
        return i > 0 ? "success":"error";
    }
}
