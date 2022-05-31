package com.fet.telemedicine.backend.repository.pgsql.po;
// Generated 2022/5/31 �U�� 04:54:49 by Hibernate Tools 5.3.15.Final

import java.util.Date;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

    private int id;
    private String name;
    private String remark;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

    public Role() {
    }

    public Role(int id) {
	this.id = id;
    }

    public Role(int id, String name, String remark, String createdBy, Date createdTime, String updatedBy,
	    Date updatedTime) {
	this.id = id;
	this.name = name;
	this.remark = remark;
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

    public String getRemark() {
	return this.remark;
    }

    public void setRemark(String remark) {
	this.remark = remark;
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
