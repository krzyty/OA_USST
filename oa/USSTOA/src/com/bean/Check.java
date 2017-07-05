package com.bean;

import java.sql.Date;

public class Check {
	private int CheckID;
	private Date CheckDate;

	public Check() {
	}

	public Check(int CheckID, Date CheckDate) {
		this.CheckID = CheckID;
		this.CheckDate = CheckDate;
	}

	public void setCheckID(float ScheduleID) {
		this.CheckID = CheckID;
	}

	public void setCheckDate(Date CheckDate) {
		this.CheckDate = CheckDate;
	}

	public int getCheckID() {
		return this.CheckID;
	}

	public Date getCheckDate() {
		return this.CheckDate;
	}
}
