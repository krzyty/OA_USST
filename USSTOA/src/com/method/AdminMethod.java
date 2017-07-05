package com.method;

import com.bean.User;
import com.bean.User;

import dao.AdminDao;

public class AdminMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private AdminDao AdminDao = new AdminDao();
	public boolean addUser(User user) {
		boolean bool = false;
		if (AdminDao.addUser(user)) {
			bool = true;
		}
		AdminDao.closeConnection();
		AdminDao = null;
		return bool;
	}
}
