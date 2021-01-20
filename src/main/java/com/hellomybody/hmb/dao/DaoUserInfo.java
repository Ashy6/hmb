package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//接口
public interface DaoUserInfo {
    //查询用户的方法  添加注解@Param()用来找参数   用户名获取当前用户
    public UserInfo getUserInfoMassage(String username);

    //    修改功能，实现状态栏的开启或者关闭  根据主键id 来更改state值
    public int updateUserInfo(String username,String sex,String birthday,int height,int weight,int target);
    //    添加功能
    public int addUserInfo(UserInfo userInfo);
}
