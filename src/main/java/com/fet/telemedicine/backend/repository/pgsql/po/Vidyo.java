package com.fet.telemedicine.backend.repository.pgsql.po;
// Generated 2022/5/31 �U�� 04:54:49 by Hibernate Tools 5.3.15.Final

import java.util.Date;

/**
 * Vidyo generated by hbm2java
 */
public class Vidyo implements java.io.Serializable {

    private int id;
    private String version;
    private String name;
    private String vidyoPin;
    private String vidyoRoomId;
    private String vidyoRoomUrl;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

    public Vidyo() {
    }

    public Vidyo(int id, String name, String vidyoPin, String vidyoRoomId, String vidyoRoomUrl) {
	this.id = id;
	this.name = name;
	this.vidyoPin = vidyoPin;
	this.vidyoRoomId = vidyoRoomId;
	this.vidyoRoomUrl = vidyoRoomUrl;
    }

    public Vidyo(int id, String name, String vidyoPin, String vidyoRoomId, String vidyoRoomUrl, String createdBy,
	    Date createdTime, String updatedBy, Date updatedTime) {
	this.id = id;
	this.name = name;
	this.vidyoPin = vidyoPin;
	this.vidyoRoomId = vidyoRoomId;
	this.vidyoRoomUrl = vidyoRoomUrl;
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

    public String getVersion() {
	return this.version;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getVidyoPin() {
	return this.vidyoPin;
    }

    public void setVidyoPin(String vidyoPin) {
	this.vidyoPin = vidyoPin;
    }

    public String getVidyoRoomId() {
	return this.vidyoRoomId;
    }

    public void setVidyoRoomId(String vidyoRoomId) {
	this.vidyoRoomId = vidyoRoomId;
    }

    public String getVidyoRoomUrl() {
	return this.vidyoRoomUrl;
    }

    public void setVidyoRoomUrl(String vidyoRoomUrl) {
	this.vidyoRoomUrl = vidyoRoomUrl;
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