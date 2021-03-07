package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//接口
public interface DaoUserInfo {
    // 注册用户时，同时添加用户信息表中的用户名
    public int addUserInfoName(UserInfo userInfo);
    public int addUserInfoNameB(UserInfo userInfo);
    // 查询用户的方法 用户名获取当前用户
    public UserInfo getUserInfoMassage(String username);
    // 查询用户的身高体重使用记录
    public List<User> getHWMessage(@Param("username")String username, @Param("pageStart") int PageStart, @Param("pageSize")int PageSize);
    public int getUserHWCounts(@Param("username")String username,@Param("timesss") String timesss);

}
