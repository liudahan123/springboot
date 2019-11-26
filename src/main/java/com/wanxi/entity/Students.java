package com.wanxi.entity;

public class Students {
    private Integer sid;
    private String sname;
    private String spwd;

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }
}
