package model;

import java.util.Date;

public class Attendance {
	private int attendanceID;
	private Date attendanceTime;
	private User user;

	public Attendance() {
	}

	public Attendance(int attendanceID, Date attendanceTime, User user) {
		this.attendanceID = attendanceID;
		this.attendanceTime = attendanceTime;
		this.user = user;
	}

	public int getAttendanceID() {
		return attendanceID;
	}

	public void setAttendanceID(int attendanceID) {
		this.attendanceID = attendanceID;
	}

	public Date getAttendanceTime() {
		return attendanceTime;
	}

	public void setAttendanceTime(Date attendanceTime) {
		this.attendanceTime = attendanceTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
