package com.bean;

public class Organization {
	private int OrganizationID;
	private String OrganizationName;
	private int OrganizationAdminID;
	private String OrganizationMessage;

	public Organization() {
	}

	public Organization(int OrganizationID, String Organization, int OrganizationAdminID) {
		this.OrganizationID = OrganizationID;
		this.OrganizationName = OrganizationName;
		this.OrganizationAdminID = OrganizationAdminID;
	}

	public void setOrganizationID(int OrganizationID) {
		this.OrganizationID = OrganizationID;
	}

	public void setOrganizationName(String Admin) {
		this.OrganizationName = OrganizationName;
	}

	public void setOrganizationAdminID(int OrganizationAdminID) {
		this.OrganizationAdminID = OrganizationAdminID;
	}
	
	public void setOrganizationMessage(String OrganizationMessage) {
		this.OrganizationMessage = OrganizationMessage;
	}

	public int getOrganizationID() {
		return this.OrganizationID;
	}

	public String getOrganizationName() {
		return this.OrganizationName;
	}

	public int getOrganizationAdminID() {
		return this.OrganizationAdminID;
	}
	
	public String getOrganizationMessage() {
		return this.OrganizationMessage;
	}
}
