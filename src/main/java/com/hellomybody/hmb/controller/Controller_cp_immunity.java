package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hellomybody.hmb.bean.Cp_immunity;
import com.hellomybody.hmb.dao.Dao_cp_immunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//免疫力测评
@RestController
public class Controller_cp_immunity {
    @Autowired
    public Dao_cp_immunity dim;
    private Object Cp_immunity;

    //    添加免疫力测评信息
//    @RequestMapping(value="/addIm", method = RequestMethod.POST, produces="application/x-www-form-urlencoded")
//    @PostMapping("/addIm")
    @RequestMapping("/addIm")
//    前端请求传Json对象则后端使用@RequestParam；
//    前端请求传Json对象的字符串则后端使用@RequestBody。
    public String addIm(@RequestBody Cp_immunity z_immunity){
//    public void name(@RequestParam("/addIm") Cp_immunity z_immunity) {
//        System.out.println(z_immunity);
        z_immunity.setEvent("免疫力测试");
        int i = dim.addMyl(z_immunity);
        String str = i >0?"success":"error";
        return str;
    }
//    @ResponseBody
//shopcode要与前端js中key对应
//    public String addIm(@RequestParam("type1")String type1,@RequestParam("type2")String type2) {
////         "form"前台传来的json对象数组
//        int i = dim.addMyl((com.hellomybody.hmb.bean.Cp_immunity) Cp_immunity);
//        JSONArray picArray = JSONArray.parseArray(that.form.type1);
//        List<String> codearr = new ArrayList<String>();
////遍历得到单个的对象
//        for (int i = 0; i < picArray.size(); i++) {
//            JSONObject jsonObject = picArray.getJSONObject(i);
////把单个对象的参数往List中塞入
//            codearr.add((String) jsonObject.get("form"));
//        }
//        System.err.println(codearr);
//        return i >0?"success":"error";
//    }
}
