package com.bean;

public class Admin {
	private String AdminName;
	private String AdminPassword;
	private int AdminID;
	private int AdminPower;

	public Admin() {
	}

	public Admin(String UserName, String UserPassword, int UserID, int UserOrganization) {
		this.AdminName = AdminName;
		this.AdminPassword = AdminPassword;
		this.AdminID = AdminID;
		this.AdminPower = AdminPower;
	}

	public void setAdminName(String AdminName) {
		this.AdminName = AdminName;
	}

	public void setAdminPassword(String AdminPassword) {
		this.AdminPassword = AdminPassword;
	}

	public void setAdminID(int AdminID) {
		this.AdminID = AdminID;
	}

	public void setAdminPower(int AdminPower) {
		this.AdminPower = AdminPower;
	}

	public String getAdminName() {
		return this.AdminName;
	}

	public String getAdminPassword() {
		return this.AdminPassword;
	}

	public int getAdminID() {
		return this.AdminID;
	}

	public int getAdminPower() {
		return this.AdminPower;
	}
}
