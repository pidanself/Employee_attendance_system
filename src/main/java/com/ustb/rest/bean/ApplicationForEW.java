package com.ustb.rest.bean;

import java.util.Date;
//加班申请
public class ApplicationForEW {
	
	private int applicatedId; //申请单号
	private int applicatedPerson;
	private Date startTime;
	private Date endTime;
	private int state; //0待审，1为批准，2为驳回
	public int getApplicatedId() {
		return applicatedId;
	}
	public void setApplicatedId(int applicatedId) {
		this.applicatedId = applicatedId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getApplicatedPerson() {
		return applicatedPerson;
	}
	public void setApplicatedPerson(int applicatedPerson) {
		this.applicatedPerson = applicatedPerson;
	}
	
	
}
