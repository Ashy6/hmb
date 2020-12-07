package com.hellomybody.hmb.controller;

import com.hellomybody.hmb.bean.Cp_immunity;
import com.hellomybody.hmb.dao.Dao_cp_immunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//免疫力测评
@RestController
public class Controller_cp_immunity {
    @Autowired
    public Dao_cp_immunity dim;
    @RequestMapping("/addIm")
    public String addIm(@RequestBody Cp_immunity im){
        im.setName("baba");
        int i = dim.addMyl(im);
        System.out.println(im);
        return i >0?"success":"error";
    }
}
