package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.UserBody;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoUserBody {
    public int addUserBody(UserBody userBody);
    public UserBody getUserBodyMassage(String username);
    //    查询用户组记录
    public List<UserBody> getBDMessage(@Param("username")String username);
    public int getUserBDCounts(@Param("username")String username);
    //    删除
    public int deleteRecord(int id);
    // 修改用户 --  后台操作
//    public UserBody getUpdateUser(int id);
//    public int editUser(UserBody user);
}