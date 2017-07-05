package model;

import java.util.Date;

public class Schedule {
	private int scheduleID;
	private String scheduleText;
	private Date scheduleDate;
	private User User;

	public Schedule() {
	}

	public Schedule(int scheduleID, String scheduleText, Date scheduleDate,
			model.User user) {
		this.scheduleID = scheduleID;
		this.scheduleText = scheduleText;
		this.scheduleDate = scheduleDate;
		User = user;
	}

	public int getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}

	public String getScheduleText() {
		return scheduleText;
	}

	public void setScheduleText(String scheduleText) {
		this.scheduleText = scheduleText;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}
}
