package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.User;
import com.hellomybody.hmb.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//接口
public interface DaoUser {
//    登录的接口方法  添加注解@Param()用来找参数     可以根据用户名和密码获取当前所有用户
    public User getUserByMassage(@Param("username") String username,@Param("password") String password);
//    获取用户列表，  使用username进行模糊查询                          pageStart记录每页的用户数量
    public List<User> getAllUser(@Param("username")String username,@Param("pageStart") int PageStart,@Param("pageSize")int PageSize);
//    获取所有的用户个数
    public int getUserCounts(@Param("username") String username);

//    修改功能，实现状态栏的开启或者关闭  根据主键id 来更改state值
    public int updateState(Integer id,Boolean state);
    public int updateStateName(String username,Boolean state);
//    添加功能+注册验证
    public int addUser(User user);
    public User getUserMassage(@Param("username") String username);
//    删除
    public int deleteUser(int id);
    public int deleteUsername(String username);
//    修改用户
    public User getUpdateUser(int id);
    public int editUser(User user);
// 用户修改自己的信息
    public User getUpdateUsername(String username);
}
