package com.hellomybody.hmb.bean;

public class UserBody {
    private int id;
    private String username;
    private String vital;       // 肺活量
    private String temperature; // 体温
    private String pblood;      // 血压
    private String fblood;      // 血脂
    private String gblood;      // 血糖
    private String vision;      // 视力值
    private String hipline;     // 臀围
    private String chest;       // 胸围
    private String waistline;   // 腰围
    private String tooth;       // 牙齿数量
    private String legspeed;    // 步速
    private String grip;        // 握力指数
    private String heart;       // 心率
    private String times;       // 记录时间

    public UserBody() {
    }

    public UserBody(String username, String vital, String temperature, String pblood, String fblood, String gblood, String vision, String hipline, String chest, String waistline, String tooth, String legspeed, String grip, String heart, String times) {
        this.username = username;
        this.vital = vital;
        this.temperature = temperature;
        this.pblood = pblood;
        this.fblood = fblood;
        this.gblood = gblood;
        this.vision = vision;
        this.hipline = hipline;
        this.chest = chest;
        this.waistline = waistline;
        this.tooth = tooth;
        this.legspeed = legspeed;
        this.grip = grip;
        this.heart = heart;
        this.times = times;
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

    public String getVital() {
        return vital;
    }

    public void setVital(String vital) {
        this.vital = vital;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPblood() {
        return pblood;
    }

    public void setPblood(String pblood) {
        this.pblood = pblood;
    }

    public String getFblood() {
        return fblood;
    }

    public void setFblood(String fblood) {
        this.fblood = fblood;
    }

    public String getGblood() {
        return gblood;
    }

    public void setGblood(String gblood) {
        this.gblood = gblood;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getHipline() {
        return hipline;
    }

    public void setHipline(String hipline) {
        this.hipline = hipline;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public String getLegspeed() {
        return legspeed;
    }

    public void setLegspeed(String legspeed) {
        this.legspeed = legspeed;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "UserBody{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", vital='" + vital + '\'' +
                ", temperature='" + temperature + '\'' +
                ", pblood='" + pblood + '\'' +
                ", fblood='" + fblood + '\'' +
                ", gblood='" + gblood + '\'' +
                ", vision='" + vision + '\'' +
                ", hipline='" + hipline + '\'' +
                ", chest='" + chest + '\'' +
                ", waistline='" + waistline + '\'' +
                ", tooth='" + tooth + '\'' +
                ", legspeed='" + legspeed + '\'' +
                ", grip='" + grip + '\'' +
                ", heart='" + heart + '\'' +
                ", times='" + times + '\'' +
                '}';
    }
}
