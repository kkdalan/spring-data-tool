package com.fet.telemedicine.backend.repository.pgsql.po;
// Generated 2022/5/31 �U�� 04:54:49 by Hibernate Tools 5.3.15.Final

import java.util.Date;

/**
 * Company generated by hbm2java
 */
public class Company implements java.io.Serializable {

    private int id;
    private String name;
    private String displayName;
    private String region;
    private Integer type;
    private String code;
    private String hostipalCode;
    private String clientCode;
    private String phone;
    private String address;
    private String email;
    private String brief;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

    public Company() {
    }

    public Company(int id) {
	this.id = id;
    }

    public Company(int id, String name, String displayName, String region, Integer type, String code,
	    String hostipalCode, String clientCode, String phone, String address, String email, String brief,
	    String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
	this.id = id;
	this.name = name;
	this.displayName = displayName;
	this.region = region;
	this.type = type;
	this.code = code;
	this.hostipalCode = hostipalCode;
	this.clientCode = clientCode;
	this.phone = phone;
	this.address = address;
	this.email = email;
	this.brief = brief;
	this.createdBy = createdBy;
	this.createdTime = createdTime;
	this.updatedBy = updatedBy;
	this.updatedTime = updatedTime;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDisplayName() {
	return this.displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public String getRegion() {
	return this.region;
    }

    public void setRegion(String region) {
	this.region = region;
    }

    public Integer getType() {
	return this.type;
    }

    public void setType(Integer type) {
	this.type = type;
    }

    public String getCode() {
	return this.code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getHostipalCode() {
	return this.hostipalCode;
    }

    public void setHostipalCode(String hostipalCode) {
	this.hostipalCode = hostipalCode;
    }

    public String getClientCode() {
	return this.clientCode;
    }

    public void setClientCode(String clientCode) {
	this.clientCode = clientCode;
    }

    public String getPhone() {
	return this.phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getAddress() {
	return this.address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getEmail() {
	return this.email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getBrief() {
	return this.brief;
    }

    public void setBrief(String brief) {
	this.brief = brief;
    }

    public String getCreatedBy() {
	return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
	return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
	this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
	return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
	return this.updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
	this.updatedTime = updatedTime;
    }

}
