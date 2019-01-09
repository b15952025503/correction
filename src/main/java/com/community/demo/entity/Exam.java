package com.community.demo.entity;

import java.util.Date;

public class Exam {
    private Integer emid;

    private String rno;

    private Date emdate;

    private String emfraction;

    private Integer emflag;

    public Integer getEmid() {
        return emid;
    }

    public void setEmid(Integer emid) {
        this.emid = emid;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno == null ? null : rno.trim();
    }

    public Date getEmdate() {
        return emdate;
    }

    public void setEmdate(Date emdate) {
        this.emdate = emdate;
    }

    public String getEmfraction() {
        return emfraction;
    }

    public void setEmfraction(String emfraction) {
        this.emfraction = emfraction == null ? null : emfraction.trim();
    }

    public Integer getEmflag() {
        return emflag;
    }

    public void setEmflag(Integer emflag) {
        this.emflag = emflag;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "emid=" + emid +
                ", rno='" + rno + '\'' +
                ", emdate=" + emdate +
                ", emfraction='" + emfraction + '\'' +
                ", emflag=" + emflag +
                '}';
    }
}