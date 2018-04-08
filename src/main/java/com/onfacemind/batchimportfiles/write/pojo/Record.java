package com.onfacemind.batchimportfiles.write.pojo;

import java.util.Date;

public class Record {
    private String id;

    private String number;

    private String idCard;

    private String validPeriod;

    private String name;

    private String ethnicity;

    private String nation;

    private String gender;

    private Integer age;

    private String location;

    private String address;

    private Date dateOfBirth;

    private String tempId;

    private Integer faceTotal;

    private String state;

    private String remark;

    private String hasWarn;

    private String warnNum;

    private String hasFinger;

    private String warnAnalyse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity == null ? null : ethnicity.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId == null ? null : tempId.trim();
    }

    public Integer getFaceTotal() {
        return faceTotal;
    }

    public void setFaceTotal(Integer faceTotal) {
        this.faceTotal = faceTotal;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHasWarn() {
        return hasWarn;
    }

    public void setHasWarn(String hasWarn) {
        this.hasWarn = hasWarn == null ? null : hasWarn.trim();
    }

    public String getWarnNum() {
        return warnNum;
    }

    public void setWarnNum(String warnNum) {
        this.warnNum = warnNum == null ? null : warnNum.trim();
    }

    public String getHasFinger() {
        return hasFinger;
    }

    public void setHasFinger(String hasFinger) {
        this.hasFinger = hasFinger == null ? null : hasFinger.trim();
    }

    public String getWarnAnalyse() {
        return warnAnalyse;
    }

    public void setWarnAnalyse(String warnAnalyse) {
        this.warnAnalyse = warnAnalyse == null ? null : warnAnalyse.trim();
    }
}