package com.community.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Correctivemeasure {
    private String correctivid;

    private String rno;

    private Date correctivdate;

    private Date correctivdatetwo;

    private String correctivname;

    private String correctivresult;

    private Integer flag;

    //基础信息里的头像
    private String photo;
    //基础信息的人员姓名
    private String rname;
    //基础信息的人员身份证号
    private String idcard;

    //教育矫正
    private Integer suid;


    private Integer eno;

    private String ename;
    private Date sudate;
    private Date sudatetwo;
    private String suEvent;
    private String suResult;
    private Integer sustatic;

    //考试评分
    private int emid;
    private Date emdate;//考试时间
    private String emFraction ;// 考试评分
    private int emflag;//考试状态

    public String getCorrectivid() {
        return correctivid;
    }

    public void setCorrectivid(String correctivid) {
        this.correctivid = correctivid == null ? null : correctivid.trim();
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno == null ? null : rno.trim();
    }

    public Date getCorrectivdate() {
        return correctivdate;
    }

    public void setCorrectivdate(String correctivdate) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(correctivdate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.correctivdate = parse;
    }

    public Date getCorrectivdatetwo() {
        return correctivdatetwo;
    }

    public void setCorrectivdatetwo(String correctivdatetwo) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(correctivdatetwo);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.correctivdatetwo = parse;
    }

    public String getCorrectivname() {
        return correctivname;
    }

    public void setCorrectivname(String correctivname) {
        this.correctivname = correctivname == null ? null : correctivname.trim();
    }

    public String getCorrectivresult() {
        return correctivresult;
    }

    public void setCorrectivresult(String correctivresult) {
        this.correctivresult = correctivresult == null ? null : correctivresult.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
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

    public void setSudate(String sudate) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(sudate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.sudate = parse;
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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getEmid() {
        return emid;
    }

    public void setEmid(int emid) {
        this.emid = emid;
    }

    public Date getEmdate() {
        return emdate;
    }

    public void setEmdate(String emdate) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(emdate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.emdate = parse;
    }

    public String getEmFraction() {
        return emFraction;
    }

    public void setEmFraction(String emFraction) {
        this.emFraction = emFraction;
    }

    public int getEmflag() {
        return emflag;
    }

    public void setEmflag(int emflag) {
        this.emflag = emflag;
    }

    public Date getSudatetwo() {
        return sudatetwo;
    }

    public void setSudatetwo(String sudatetwo) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(sudatetwo);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.sudatetwo = parse;
    }

    public String getSuEvent() {
        return suEvent;
    }

    public void setSuEvent(String suEvent) {
        this.suEvent = suEvent;
    }

    public String getSuResult() {
        return suResult;
    }

    public void setSuResult(String suResult) {
        this.suResult = suResult;
    }

    @Override
    public String toString() {
        return "Correctivemeasure{" +
                "correctivid='" + correctivid + '\'' +
                ", rno='" + rno + '\'' +
                ", correctivdate=" + correctivdate +
                ", correctivdatetwo=" + correctivdatetwo +
                ", correctivname='" + correctivname + '\'' +
                ", correctivresult='" + correctivresult + '\'' +
                ", flag=" + flag +
                ", photo='" + photo + '\'' +
                ", rname='" + rname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", suid=" + suid +
                ", eno=" + eno +
                ", ename='" + ename + '\'' +
                ", sudate=" + sudate +
                ", sudatetwo=" + sudatetwo +
                ", suEvent='" + suEvent + '\'' +
                ", suResult='" + suResult + '\'' +
                ", sustatic=" + sustatic +
                ", emid=" + emid +
                ", emdate=" + emdate +
                ", emFraction='" + emFraction + '\'' +
                ", emflag=" + emflag +
                '}';
    }
}