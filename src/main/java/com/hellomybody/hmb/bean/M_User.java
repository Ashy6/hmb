package com.hellomybody.hmb.bean;

import java.util.List;

public class M_User {
    private int id;
    private String title;
    private String path;
    private List<M_UserSub> sList;    //此处存放私有集合 M_UserSub分支导航集合

    public M_User() {
    }

    public M_User(int id, String title, String path, List<M_UserSub> sList) {
        this.id = id;
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

    public List<M_UserSub> getsList() {
        return sList;
    }

    public void setsList(List<M_UserSub> sList) {
        this.sList = sList;
    }

    @Override
    public String toString() {
        return "M_User{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", sList=" + sList +
                '}';
    }
}
