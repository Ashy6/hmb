package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.QueryInfo;
import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.dao.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerUser {
    @Autowired
    private DaoUser duser;

    //    查询的方法
    @RequestMapping ("/allUser")
    public String getUserList(QueryInfo queryInfo){
        System.out.println("用户查询完毕");
        //   获取查询信息和当前编号  存储到 numbers中
        int numbers = duser.getUserCounts( "%"+queryInfo.getQuery()+"%");
        //  开始页面=（当前页的编号-1）*每页最大数
        int pageStart = (queryInfo.getPageNum() - 1) *queryInfo.getPageSize();
        //   列表信息  存放到 list 中         "%"+queryInfo.getQuery()+"%"  为 模糊查询 获取的查询方法
        List<User> users = duser.getAllUser( "%"+queryInfo.getQuery()+"%",pageStart,queryInfo.getPageSize());
        /*   创建hashmap  用于存放结果 */
        HashMap<String,Object> res = new HashMap<>();
        res.put("numbers",numbers);         //最大页
        res.put("data",users);              //结果
        //  创建json对象，将string类型的结果转码为json
        String ss = JSON.toJSONString(res);
        return ss;
    }

    //    查询用户ID
    @RequestMapping("/findUserID")
    public String getUserInfoMassage(String username){
        User id = duser.getUserID(username);
        String res = JSON.toJSONString(id);
        return res;
    }

    //    更新的方法     修改用户状态
    @RequestMapping("/userState")
    public String updateUserState(@RequestParam("id")Integer id,@RequestParam("state") Boolean state){
        int i = duser.updateState(id, state);
        String str = i >0?"success":"error";
        return str;
    }
    // 用户自己---修改用户状态
    @RequestMapping("/userStatename")
    public String updateUserStatename(@RequestParam("username")String username,@RequestParam("state") Boolean state){
        int i = duser.updateStateName(username, state);
        String str = i >0?"success":"error";
        return str;
    }

    //    增加的方法     添加用户
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        User u = duser.getUserMassage(user.getUsername());
        //       创建map存放查询出的user和flag，转化json字符串，使用JSON.toJSONString转化对象为json
        HashMap<String,Object> res = new HashMap<>();//        初始信息 flag
        String flag = "yes";
        if (u!=null){
            flag = "no";  //如果不为空，则不可以注册，则先赋值ok
            //        在res中添加信息 flag 和 user-
            res.put("flag",flag);
            res.put("user",user);
        //        json字符串，可以转换对象的信息为字符信息
        String res_json = JSON.toJSONString(res);
        return res_json;
        }else {
            user.setRole("普通用户");
            user.setState(true);
            int i = duser.addUser(user);
            return i > 0 ? "success" : "error";
        }
    }

    //    删除的方法
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int i = duser.deleteUser(id);
        return i > 0 ? "success":"error";
    }
    //  用户删除的方法，但是这个方法放弃使用了
    //  因为用户  注销===更改了用户的状态
    @RequestMapping("/deleteUsername")
    public String deleteUser(String username){
        int i = duser.deleteUsername(username);
        return i > 0 ? "success":"error";
    }

    //    更新用户      获取修改信息
    @RequestMapping("/getupdate")
    public String getUpdateUser(int id){
        User user = duser.getUpdateUser(id);
        String string = JSON.toJSONString(user);
        return string;
    }

    //  修改  编辑用户信息
    @RequestMapping("/editUser")
    public String editUser(@RequestBody User user){
        int i = duser.editUser(user);
        return i > 0 ? "success":"error";
    }

    //   用户的更改    获取修改信息
    @RequestMapping("/getUpdateUser")
    public String getUpdateUser(String username){
        User user = duser.getUpdateUsername(username);
        String string = JSON.toJSONString(user);
        return string;
    }
}







