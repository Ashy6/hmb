package com.hellomybody.hmb.controller;

import com.alibaba.fastjson.JSON;
import com.hellomybody.hmb.bean.Food;
import com.hellomybody.hmb.bean.QueryInfo;
import com.hellomybody.hmb.dao.DaoFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerFood {
    @Autowired
    private DaoFood daoFood;
    @RequestMapping("/allFood")
//    将 将来所需的 分页的内容封装到实体Food中
    public String getFoodList(QueryInfo queryInfo){
//        获取最大列表数和当前编号  存储到 foodCounts中
        int foodCounts = daoFood.getFoodCounts( "%" + queryInfo.getQuery() + "%");
//        开始页面=（当前页的编号-1）*每页最大数
        int pageStart = (queryInfo.getPageNum() - 1) *queryInfo.getPageSize();

//        列表信息  存放到 list 中         "%"+queryInfo.getQuery()+"%"  为获取的查询方法
        List<Food> foods = daoFood.getAllFood( "%" + queryInfo.getQuery() + "%","%" + queryInfo.getQuery() + "%",pageStart,queryInfo.getPageSize());
        /*   创建hashmap  用于存放结果 */
        HashMap<String,Object> res = new HashMap<>();
        res.put("num",foodCounts);         //最大页
        res.put("data",foods);              //结果
//        创建json对象，将string类型的结果转码为json
        String res_js = JSON.toJSONString(res);
//        System.out.println(res);
        return res_js;
    }

}
