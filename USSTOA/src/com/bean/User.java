package com.bean;

public class User {
	private String UserName;
	private String UserPassword;
	private int UserID;
	private int UserOrganizationID;

	public User() {
	}

	public User(String UserName, String UserPassword, int UserID, int UserOrganization) {
		this.UserName = UserName;
		this.UserPassword = UserPassword;
		this.UserID = UserID;
		this.UserOrganizationID = UserOrganizationID;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public void setUserPassword(String UserPassword) {
		this.UserPassword = UserPassword;
	}

	public void setUserID(int UserID) {
		this.UserID = UserID;
	}

	public void setUserOrganizationID(int UserOrganizationID) {
		this.UserOrganizationID = UserOrganizationID;
	}

	public String getUserName() {
		return this.UserName;
	}

	public String getUserPassword() {
		return this.UserPassword;
	}

	public int getUserID() {
		return this.UserID;
	}

	public int getUserOrganizationID() {
		return this.UserOrganizationID;
	}
}
