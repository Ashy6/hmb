package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.Food;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DaoFood {
    //    添加注解@Param()用来找参数     可以根据食物名和别名获取当前所有食物
    public Food getFoodByMassage(@Param("name") String name, @Param("alias") String alias);

    //    获取食品列表，  使用name和alias进行模糊查询                          pageStart记录每页的用户数量
    public List<Food> getAllFood(@Param("name")String name,@Param("pageStarts") int PageStarts,@Param("pageSizes")int PageSizes);
    //    获取所有的食品数据个数
    public int getFoodCounts(@Param("name") String name);

   // List<Food> getAllFood(String s, int pageStarts, int pageSizes);
}
