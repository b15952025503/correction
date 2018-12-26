package com.community.demo.entity;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Judgment {
    private String jno;

    private String courtname;

    private Date judgmentdate;

    private Date originaldate;

    private Date enddate;

    private String supplementaryPunishments;

    private String charges;

    private String verdictPenalty;

    private Date executiondate;

    private String phone;

    private Date inaffair;

    private String affairdate;


    public String getJno() {
        return jno;
    }

    public void setJno(String jno) {
        this.jno = jno == null ? null : jno.trim();
    }

    public String getCourtname() {
        return courtname;
    }

    public void setCourtname(String courtname) {
        this.courtname = courtname == null ? null : courtname.trim();
    }

    public Date getJudgmentdate() {

        return judgmentdate;
    }

    public void setJudgmentdate(String judgmentdate) {
        Date parse=null;
        try {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        parse= simpleDateFormat.parse(judgmentdate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.judgmentdate = parse;
    }

    public Date getOriginaldate() {
        return originaldate;
    }

    public void setOriginaldate(String originaldate) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(originaldate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.originaldate = parse;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getSupplementaryPunishments() {
        return supplementaryPunishments;
    }

    public void setSupplementaryPunishments(String supplementaryPunishments) {
        this.supplementaryPunishments = supplementaryPunishments == null ? null : supplementaryPunishments.trim();
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges == null ? null : charges.trim();
    }

    public String getVerdictPenalty() {
        return verdictPenalty;
    }

    public void setVerdictPenalty(String verdictPenalty) {
        this.verdictPenalty = verdictPenalty == null ? null : verdictPenalty.trim();
    }

    public Date getExecutiondate() {
        return executiondate;
    }

    public void setExecutiondate(String executiondate) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(executiondate);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.executiondate = parse;
    }

    public Date getInaffair() {
        return inaffair;
    }

    public void setInaffair(String inaffair) {
        Date parse=null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            parse= simpleDateFormat.parse(inaffair);

        }catch (Exception e){
            e.printStackTrace();
        }
        this.inaffair = parse;
    }

    public String getAffairdate() {
        return affairdate;
    }

    public void setAffairdate(String affairdate) {
        this.affairdate = affairdate == null ? null : affairdate.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Judgment{" +
                "jno='" + jno + '\'' +
                ", courtname='" + courtname + '\'' +
                ", judgmentdate=" + judgmentdate +
                ", originaldate=" + originaldate +
                ", enddate=" + enddate +
                ", supplementaryPunishments='" + supplementaryPunishments + '\'' +
                ", charges='" + charges + '\'' +
                ", verdictPenalty='" + verdictPenalty + '\'' +
                ", executiondate=" + executiondate +
                ", phone='" + phone + '\'' +
                ", inaffair=" + inaffair +
                ", affairdate='" + affairdate + '\'' +
                '}';
    }
}