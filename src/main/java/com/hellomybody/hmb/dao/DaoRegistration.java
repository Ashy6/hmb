package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.Registration_date;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRegistration {
    // 查询用户的方法 用户名获取 -- 第一次注册的时间
    public Registration_date getFirstTimeLogin(String username);
}
