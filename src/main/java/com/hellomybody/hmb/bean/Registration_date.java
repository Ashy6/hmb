package com.hellomybody.hmb.bean;

public class Registration_date {

    private String username;
    private String firstTime;

    public Registration_date() {
    }

    public Registration_date(String username, String firstTime) {
        this.username = username;
        this.firstTime = firstTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    @Override
    public String toString() {
        return "Registration_date{" +
                "username='" + username + '\'' +
                ", firstTime='" + firstTime + '\'' +
                '}';
    }
}
