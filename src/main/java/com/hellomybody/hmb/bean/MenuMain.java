package com.hellomybody.hmb.bean;

import java.util.List;
//实体类 用户
//后台菜单 主导航
public class MenuMain {
    private int id;
    private String title;
    private String path;
    private List<MenuSub> sList;    //此处存放MenuSub分支导航集合

    public MenuMain() {
    }

    public MenuMain(String title, String path, List<MenuSub> sList) {
        this.title = title;
        this.path = path;
        this.sList = sList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<MenuSub> getsList() {
        return sList;
    }

    public void setsList(List<MenuSub> sList) {
        this.sList = sList;
    }

    @Override
    public String toString() {
        return "MenuMain{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", sList=" + sList +
                '}';
    }
}
