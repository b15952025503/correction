package com.community.demo.entity;

import java.util.List;

public class AuthorityManagement {
    private Integer id;

    private String amname;

    private String url;

    private String beicon;

    private String aficon;

    private String childicon;

    private Integer parentid;

    private List<AuthorityManagement> ls;

    public List<AuthorityManagement> getLs() {
        return ls;
    }

    public void setLs(List<AuthorityManagement> ls) {
        this.ls = ls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmname() {
        return amname;
    }

    public void setAmname(String amname) {
        this.amname = amname == null ? null : amname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getBeicon() {
        return beicon;
    }

    public void setBeicon(String beicon) {
        this.beicon = beicon == null ? null : beicon.trim();
    }

    public String getAficon() {
        return aficon;
    }

    public void setAficon(String aficon) {
        this.aficon = aficon == null ? null : aficon.trim();
    }

    public String getChildicon() {
        return childicon;
    }

    public void setChildicon(String childicon) {
        this.childicon = childicon == null ? null : childicon.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "AuthorityManagement{" +
                "id=" + id +
                ", amname='" + amname + '\'' +
                ", url='" + url + '\'' +
                ", beicon='" + beicon + '\'' +
                ", aficon='" + aficon + '\'' +
                ", childicon='" + childicon + '\'' +
                ", parentid=" + parentid +
                ", ls=" + ls +
                '}';
    }
}