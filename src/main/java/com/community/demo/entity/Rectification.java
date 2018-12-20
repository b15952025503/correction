package com.community.demo.entity;

import freemarker.template.SimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Rectification {
    private List<Rectification> list;

    private String icon;

    private String name;

    private Integer value;

    private String rno;

    private String photo;

    private String rname;

    private String formerName;

    private String idcard;

    private String sex;

    private String age;

    private Date birthday;

    private String position;

    private String maritalStatus;

    private String nativePlace;

    private String householdRegistration;

    private String address;

    private Integer eid;

    private Integer pid;

    private Integer pcid;

    private Integer rid;

    private Integer tpid;

    private String activeArea;

    private String eflag;

    private String flag;

    private String flagName;

    private String ename;

    private String pname;

    private String pcname;

    private String rgname;

    private String phone;
    private String tpname;

    private String context;

    private String family;

    private String paddress;

    private String pphone;

    private String jNo;

    private String courtName;

    private String judgmentDate;

    private String originalDate;

    private String Supplementary_punishments;

    private String fname;

    private String endDate;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Rectification> getList() {
        return list;
    }

    public void setList(List<Rectification> list) {
        this.list = list;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    public String getjNo() {
        return jNo;
    }

    public void setjNo(String jNo) {
        this.jNo = jNo;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getJudgmentDate() {
        return judgmentDate;
    }

    public void setJudgmentDate(String judgmentDate) {
        this.judgmentDate = judgmentDate;
    }

    public String getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(String originalDate) {
        this.originalDate = originalDate;
    }

    public String getSupplementary_punishments() {
        return Supplementary_punishments;
    }

    public void setSupplementary_punishments(String supplementary_punishments) {
        Supplementary_punishments = supplementary_punishments;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public String getRgname() {
        return rgname;
    }

    public void setRgname(String rgname) {
        this.rgname = rgname;
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno == null ? null : rno.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration == null ? null : householdRegistration.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getTpid() {
        return tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    public String getActiveArea() {
        return activeArea;
    }

    public void setActiveArea(String activeArea) {
        this.activeArea = activeArea == null ? null : activeArea.trim();
    }

    public String getEflag() {
        return eflag;
    }

    public void setEflag(String eflag) {
        this.eflag = eflag == null ? null : eflag.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Rectification() {
        super();
    }

    public Rectification(String rno, String photo, String rname, String formerName, String idcard, String sex, String age, Date birthday, String position, String maritalStatus, String nativePlace, String householdRegistration, String address, Integer eid, Integer pid, Integer pcid, Integer rid, Integer tpid, String activeArea, String eflag, String flag, String flagName, String ename, String pname, String pcname, String rgname, String phone, String tpname, String context, String family, String paddress, String pphone, String jNo, String courtName, String judgmentDate, String originalDate, String supplementary_punishments, String fname, String endDate) {
        this.rno = rno;
        this.photo = photo;
        this.rname = rname;
        this.formerName = formerName;
        this.idcard = idcard;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.position = position;
        this.maritalStatus = maritalStatus;
        this.nativePlace = nativePlace;
        this.householdRegistration = householdRegistration;
        this.address = address;
        this.eid = eid;
        this.pid = pid;
        this.pcid = pcid;
        this.rid = rid;
        this.tpid = tpid;
        this.activeArea = activeArea;
        this.eflag = eflag;
        this.flag = flag;
        this.flagName = flagName;
        this.ename = ename;
        this.pname = pname;
        this.pcname = pcname;
        this.rgname = rgname;
        this.phone = phone;
        this.tpname = tpname;
        this.context = context;
        this.family = family;
        this.paddress = paddress;
        this.pphone = pphone;
        this.jNo = jNo;
        this.courtName = courtName;
        this.judgmentDate = judgmentDate;
        this.originalDate = originalDate;
        Supplementary_punishments = supplementary_punishments;
        this.fname = fname;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Rectification{" +
                "rno='" + rno + '\'' +
                ", photo='" + photo + '\'' +
                ", rname='" + rname + '\'' +
                ", formerName='" + formerName + '\'' +
                ", idcard='" + idcard + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", birthday=" + birthday +
                ", position='" + position + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", householdRegistration='" + householdRegistration + '\'' +
                ", address='" + address + '\'' +
                ", eid=" + eid +
                ", pid=" + pid +
                ", pcid=" + pcid +
                ", rid=" + rid +
                ", tpid=" + tpid +
                ", activeArea='" + activeArea + '\'' +
                ", eflag='" + eflag + '\'' +
                ", flag='" + flag + '\'' +
                ", flagName='" + flagName + '\'' +
                ", ename='" + ename + '\'' +
                ", pname='" + pname + '\'' +
                ", pcname='" + pcname + '\'' +
                ", rgname='" + rgname + '\'' +
                ", phone='" + phone + '\'' +
                ", tpname='" + tpname + '\'' +
                ", context='" + context + '\'' +
                ", family='" + family + '\'' +
                ", paddress='" + paddress + '\'' +
                ", pphone='" + pphone + '\'' +
                ", jNo='" + jNo + '\'' +
                ", courtName='" + courtName + '\'' +
                ", judgmentDate='" + judgmentDate + '\'' +
                ", originalDate='" + originalDate + '\'' +
                ", Supplementary_punishments='" + Supplementary_punishments + '\'' +
                ", fname='" + fname + '\'' +
                ", endDate='" + endDate + '\'' +
                '}'+list.size();
    }
}