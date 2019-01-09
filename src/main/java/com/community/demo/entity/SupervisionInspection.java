package com.community.demo.entity;

import java.util.Date;

public class SupervisionInspection {
    private Integer suid;

    private String rno;

    private Integer eno;

    private Date sudate;

    private Date sudatetwo;

    private String suevent;

    private String suresult;

    private Integer sustatic;

    private String ename;

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno == null ? null : rno.trim();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getSudate() {
        return sudate;
    }

    public void setSudate(Date sudate) {
        this.sudate = sudate;
    }

    public Date getSudatetwo() {
        return sudatetwo;
    }

    public void setSudatetwo(Date sudatetwo) {
        this.sudatetwo = sudatetwo;
    }

    public String getSuevent() {
        return suevent;
    }

    public void setSuevent(String suevent) {
        this.suevent = suevent == null ? null : suevent.trim();
    }

    public String getSuresult() {
        return suresult;
    }

    public void setSuresult(String suresult) {
        this.suresult = suresult == null ? null : suresult.trim();
    }

    public Integer getSustatic() {
        return sustatic;
    }

    public void setSustatic(Integer sustatic) {
        this.sustatic = sustatic;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "SupervisionInspection{" +
                "suid=" + suid +
                ", rno='" + rno + '\'' +
                ", eno=" + eno +
                ", sudate=" + sudate +
                ", sudatetwo=" + sudatetwo +
                ", suevent='" + suevent + '\'' +
                ", suresult='" + suresult + '\'' +
                ", sustatic=" + sustatic +
                ", ename='" + ename + '\'' +
                '}';
    }
}