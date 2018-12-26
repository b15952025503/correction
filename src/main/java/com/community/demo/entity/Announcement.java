package com.community.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Announcement {
    private Integer id;

    private Integer uid;

    private String title;

    private String ename;

    private Date putdate;

    private String context;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPutdate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(putdate);
        return format;
    }

    public void setPutdate(Date putdate) {
        this.putdate = putdate;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", ename='" + ename + '\'' +
                ", putdate=" + putdate +
                ", context='" + context + '\'' +
                '}';
    }
}