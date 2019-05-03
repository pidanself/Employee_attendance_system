package com.ustb.rest.bean;

import java.util.Date;

public class WorkArrangement {
	//工作开始时间
	private Date startTime;
	//工作结束时间
	private Date endTime;
	//被安排的人
	private int employeeId;
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
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getArrangePerson() {
		return arrangePerson;
	}
	public void setArrangePerson(int arrangePerson) {
		this.arrangePerson = arrangePerson;
	}
	//安排工作安排的人
	private int arrangePerson;
}
