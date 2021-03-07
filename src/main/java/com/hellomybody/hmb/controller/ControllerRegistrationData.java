package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.Registration_date;
import com.hellomybody.hmb.dao.DaoRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRegistrationData {
    @Autowired    //自动注解daomenu，引入
    private DaoRegistration daoRegistration;
    //    查询用户 -- 第一次注册的时间
    @RequestMapping("/findFirstTimeLogin")
    public String getFirstTimeLogin(String username){
        Registration_date user = daoRegistration.getFirstTimeLogin(username);
        String re = JSON.toJSONString(user);
        return re;
    }
}
