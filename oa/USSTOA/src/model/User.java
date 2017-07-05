package model;

public class User {
	private int userID;
	private String userName;
	private String userPassword;
	private Department Department;
	private String userRole;

	public User() {
	}

	public User(int userID, String userName, String userPassword,
			model.Department department, String userRole) {
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
		Department = department;
		this.userRole = userRole;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
