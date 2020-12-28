package com.hellomybody.hmb.controller;

import com.hellomybody.hmb.bean.Cp_sleep;
import com.hellomybody.hmb.dao.Dao_cp_sleep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//睡眠测评
@RestController
public class Controller_cp_sleep {

    @Autowired
    private Dao_cp_sleep dsl;
//    增加睡眠测评
    @RequestMapping("/addSleep")
    public String addSleep(@RequestBody Cp_sleep sl){
        sl.setEvent("睡眠测试");
        System.out.println(sl);
        int ss = dsl.addSleep(sl);
        return ss > 0 ? "success":"error";
//    @RequestBody
//    public String addSleep(@RequestBody Cp_sleep z_sleep){
//        z_sleep.setName("baba");
//        System.out.println(z_sleep);
//        int i = dsl.addSleep(z_sleep);
//        System.out.println(i);
//        return i > 0 ? "success":"error";
    }
}
