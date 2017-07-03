package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dao.UserDao;
//import servlet.User;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class Listener implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public Listener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("sessionCreate!!!");
		System.out.println();
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("session过期，关闭数据库连接");
	}

}
