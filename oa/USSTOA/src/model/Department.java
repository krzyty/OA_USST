package model;

public class Department {
	private int departmentID;
	private String departmentName;
	private Organization organization;

	public Department() {
	}

	public Department(int departmentID, String departmentName,
			Organization organization) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.organization = organization;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}
