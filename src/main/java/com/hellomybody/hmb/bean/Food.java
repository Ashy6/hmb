package com.hellomybody.hmb.bean;

public class Food {

    private int id;
    private String name;
    private String alias;
    private int calorie;
    private boolean state;

    public Food() {
    }

    //    完成初始化（创建一个没有id主键的构造）
    public Food( String name, String alias, int calorie, boolean state) {
        this.name = name;
        this.alias = alias;
        this.calorie = calorie;
        this.state = state;
    }
//    创建set get方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", calorie=" + calorie +
                ", state=" + state +
                '}';
    }

}
