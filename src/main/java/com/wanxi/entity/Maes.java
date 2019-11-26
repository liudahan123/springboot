package com.wanxi.entity;

public class Maes {
    private Integer mid;
    private String mname;
    private String mpwd;
    private String msex;
    private String mold;
    private String mphone;
    private String mhobbys;
    private String mmarriages;

    @Override
    public String toString() {
        return "Maes{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mpwd='" + mpwd + '\'' +
                ", msex='" + msex + '\'' +
                ", mold='" + mold + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mhobbys='" + mhobbys + '\'' +
                ", mmarriages='" + mmarriages + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public String getMsex() {
        return msex;
    }

    public void setMsex(String msex) {
        this.msex = msex;
    }

    public String getMold() {
        return mold;
    }

    public void setMold(String mold) {
        this.mold = mold;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMhobbys() {
        return mhobbys;
    }

    public void setMhobbys(String mhobbys) {
        this.mhobbys = mhobbys;
    }

    public String getMmarriages() {
        return mmarriages;
    }

    public void setMmarriages(String mmarriages) {
        this.mmarriages = mmarriages;
    }
}
