package com.hellomybody.hmb.dao;

        import com.hellomybody.hmb.bean.M_User;
        import org.springframework.stereotype.Repository;
        import java.util.List;
//为用户menu创建接口dao层
@Repository
public interface Dao_U_Menu {
    //    创建获取所有list集合
    public List<M_User> getUserMenus();
}
