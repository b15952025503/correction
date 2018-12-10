package com.community.demo.entity;

import java.util.Date;

public class Loginfo1 {
    private Integer id;

    private Date ldate;

    private Integer uid;

    private String context;

    private String ename;

    private String phone;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLdate() {
        return ldate;
    }

    public void setLdate(Date ldate) {
        this.ldate = ldate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    @Override
    public String toString() {
        return "Loginfo1{" +
                "id=" + id +
                ", ldate=" + ldate +
                ", uid=" + uid +
                ", context='" + context + '\'' +
                ", ename='" + ename + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}