package com.fet.telemedicine.backend.repository.pgsql.po;
// Generated 2022/5/31 �U�� 04:54:49 by Hibernate Tools 5.3.15.Final

import java.util.Date;

/**
 * UserLog generated by hbm2java
 */
public class UserLog implements java.io.Serializable {

    private int id;
    private int userId;
    private String ip;
    private Date loginTime;
    private String actionUrl;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

    public UserLog() {
    }

    public UserLog(int id, int userId) {
	this.id = id;
	this.userId = userId;
    }

    public UserLog(int id, int userId, String ip, Date loginTime, String actionUrl, String createdBy, Date createdTime,
	    String updatedBy, Date updatedTime) {
	this.id = id;
	this.userId = userId;
	this.ip = ip;
	this.loginTime = loginTime;
	this.actionUrl = actionUrl;
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

    public int getUserId() {
	return this.userId;
    }

    public void setUserId(int userId) {
	this.userId = userId;
    }

    public String getIp() {
	return this.ip;
    }

    public void setIp(String ip) {
	this.ip = ip;
    }

    public Date getLoginTime() {
	return this.loginTime;
    }

    public void setLoginTime(Date loginTime) {
	this.loginTime = loginTime;
    }

    public String getActionUrl() {
	return this.actionUrl;
    }

    public void setActionUrl(String actionUrl) {
	this.actionUrl = actionUrl;
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