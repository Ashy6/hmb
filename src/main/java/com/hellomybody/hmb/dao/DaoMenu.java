package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.MenuMain;
import org.springframework.stereotype.Repository;

import java.util.List;

//为menu创建接口dao层
@Repository
public interface DaoMenu {
    public List<MenuMain> getMenus();
}
