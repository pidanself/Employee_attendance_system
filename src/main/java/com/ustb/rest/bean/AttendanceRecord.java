package com.ustb.rest.bean;

import java.util.Date;

public class AttendanceRecord {
	private Date startTime;
	private Date endTime;
	private Date todayTime; //主键
	private int employeeId; //主键
	
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
	public Date getTodayTime() {
		return todayTime;
	}
	public void setTodayTime(Date todayTime) {
		this.todayTime = todayTime;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
