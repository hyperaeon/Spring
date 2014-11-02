package com.smart.bean;

import org.apache.shiro.session.Session;

public class LoginSession {

	private String loginName;

	// private Session session;

	private String passwod;

	public LoginSession(String loginName, String passwod) {
		this.loginName = loginName;
		this.passwod = passwod;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPasswod() {
		return passwod;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	// public Session getSession() {
	// return session;
	// }
	//
	// public void setSession(Session session) {
	// this.session = session;
	// }

}
