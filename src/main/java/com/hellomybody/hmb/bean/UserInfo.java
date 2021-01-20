package com.hellomybody.hmb.bean;
//用户基本信息的封装
public class UserInfo {

    private int id;
    private String username;
    private String sex;
    private String birthday;
    private String ages;
    private int height;
    private int weight;
    private int target;
    private String timesss;

    public UserInfo() {
    }

    public UserInfo(int id, String username, String sex, String birthday, String ages, int height, int weight, int target, String timesss) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.ages = ages;
        this.height = height;
        this.weight = weight;
        this.target = target;
        this.timesss = timesss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAges() {
        return ages;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getTimesss() {
        return timesss;
    }

    public void setTimesss(String timesss) {
        this.timesss = timesss;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", ages=" + ages +
                ", height=" + height +
                ", weight=" + weight +
                ", target=" + target +
                ", timesss=" + timesss +
                '}';
    }
}
