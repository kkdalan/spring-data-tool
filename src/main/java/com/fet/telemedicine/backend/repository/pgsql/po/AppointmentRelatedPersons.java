package com.fet.telemedicine.backend.repository.pgsql.po;
// Generated 2022/5/31 �U�� 04:54:49 by Hibernate Tools 5.3.15.Final

import java.util.Date;

/**
 * AppointmentRelatedPersons generated by hbm2java
 */
public class AppointmentRelatedPersons implements java.io.Serializable {

    private int id;
    private int appointmentId;
    private int relatedUserId;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

    public AppointmentRelatedPersons() {
    }

    public AppointmentRelatedPersons(int id, int appointmentId, int relatedUserId) {
	this.id = id;
	this.appointmentId = appointmentId;
	this.relatedUserId = relatedUserId;
    }

    public AppointmentRelatedPersons(int id, int appointmentId, int relatedUserId, String createdBy, Date createdTime,
	    String updatedBy, Date updatedTime) {
	this.id = id;
	this.appointmentId = appointmentId;
	this.relatedUserId = relatedUserId;
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

    public int getAppointmentId() {
	return this.appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
	this.appointmentId = appointmentId;
    }

    public int getRelatedUserId() {
	return this.relatedUserId;
    }

    public void setRelatedUserId(int relatedUserId) {
	this.relatedUserId = relatedUserId;
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