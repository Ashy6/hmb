package com.hellomybody.hmb.dao;

import com.hellomybody.hmb.bean.Cp_sleep;
import org.springframework.stereotype.Repository;

//睡眠测评接口
@Repository
public interface Dao_cp_sleep {
    //    添加功能
    public int addSleep(Cp_sleep sl);
}
