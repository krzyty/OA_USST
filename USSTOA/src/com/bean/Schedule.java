package com.bean;

public class Schedule {
	private float ScheduleDate;
	private String ScheduleContent;

	public Schedule() {
	}

	public Schedule(float ScheduleID, String ScheduleContent) {
		this.ScheduleDate = ScheduleDate;
		this.ScheduleContent = ScheduleContent;
	}

	public void setScheduleID(float ScheduleID) {
		this.ScheduleDate = ScheduleDate;
	}

	public void setScheduleContent(String ScheduleContent) {
		this.ScheduleContent = ScheduleContent;
	}

	public float getScheduleID() {
		return this.ScheduleDate;
	}

	public String getScheduleContent() {
		return this.ScheduleContent;
	}
}
