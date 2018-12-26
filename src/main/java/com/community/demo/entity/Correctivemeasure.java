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
                '}';
    }
}