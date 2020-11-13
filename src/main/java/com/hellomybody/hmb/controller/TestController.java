package com.hellomybody.hmb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//restcontroller注解命令所有方法返回字符块
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
