package com.hellomybody.hmb.bean;

import com.alibaba.fastjson.JSONArray;

public class Cp_immunity {
    public int id;
    private String name;
    private String type1;
    private String type2;
    private String type3;
    private String type4;
    private String resource5;
    private String type6;
    private String resource7;
    private String resource8;
    private String resource9;
    private String resource10;
    private String resource11;
    private String resource12;
    private String type13;
    private String timesss;
    private String event;
    private String score;
    public Cp_immunity() {
    }
    //    完成初始化（创建一个没有id主键的构造）

    public Cp_immunity(String name, String type1, String type2, String type3, String type4, String resource5, String type6, String resource7, String resource8, String resource9, String resource10, String resource11, String resource12, String type13, String timesss, String event, String score) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.type4 = type4;
        this.resource5 = resource5;
        this.type6 = type6;
        this.resource7 = resource7;
        this.resource8 = resource8;
        this.resource9 = resource9;
        this.resource10 = resource10;
        this.resource11 = resource11;
        this.resource12 = resource12;
        this.type13 = type13;
        this.timesss = timesss;
        this.event = event;
        this.score = score;
    }


    //    get set 方法

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

    public String getType1() {
        return type1;
    }

    public void setType1(JSONArray type1) {
        this.type1 = type1.toString();
    }

    public String getType2() {
        return type2;
    }

    public void setType2(JSONArray type2) {
        this.type2 = type2.toString();
    }

    public String getType3() {
        return type3;
    }

    public void setType3(JSONArray type3) {
        this.type3 = type3.toString();
    }

    public String getType4() {
        return type4;
    }

    public void setType4(JSONArray type4) {
        this.type4 = type4.toString();
    }

    public String getResource5() {
        return resource5;
    }

    public void setResource5(String resource5) {
        this.resource5 = resource5;
    }

    public String getType6() {
        return type6;
    }

    public void setType6(JSONArray type6) {
        this.type6 = type6.toString();
    }

    public String getResource7() {
        return resource7;
    }

    public void setResource7(String resource7) {
        this.resource7 = resource7;
    }

    public String getResource8() {
        return resource8;
    }

    public void setResource8(String resource8) {
        this.resource8 = resource8;
    }

    public String getResource9() {
        return resource9;
    }

    public void setResource9(String resource9) {
        this.resource9 = resource9;
    }

    public String getResource10() {
        return resource10;
    }

    public void setResource10(String resource10) {
        this.resource10 = resource10;
    }

    public String getResource11() {
        return resource11;
    }

    public void setResource11(String resource11) {
        this.resource11 = resource11;
    }

    public String getResource12() {
        return resource12;
    }

    public void setResource12(String resource12) {
        this.resource12 = resource12;
    }

    public String getType13() {
        return type13;
    }

    public void setType13(JSONArray type13) {
        this.type13 = type13.toString();
    }

    public String getTimesss() {
        return timesss;
    }

    public void setTime(String timesss) {
        this.timesss = timesss;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Cp_immunity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", type3='" + type3 + '\'' +
                ", type4='" + type4 + '\'' +
                ", resource5='" + resource5 + '\'' +
                ", type6='" + type6 + '\'' +
                ", resource7='" + resource7 + '\'' +
                ", resource8='" + resource8 + '\'' +
                ", resource9='" + resource9 + '\'' +
                ", resource10='" + resource10 + '\'' +
                ", resource11='" + resource11 + '\'' +
                ", resource12='" + resource12 + '\'' +
                ", type13='" + type13 + '\'' +
                ", timesss='" + timesss + '\'' +
                ", event='" + event + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
