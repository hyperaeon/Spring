package com.spring.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.smart.bean.LoginSession;
import com.spring.domain.User;

public class UserService {
	
	// ʹ����һ���������� demoCache
	@Cacheable(value = "demoCache")
	public User getAccountByName(String userName) {
		// �����ڲ�ʵ�ֲ����ǻ����߼���ֱ��ʵ��ҵ��
		System.out.println("real query account." + userName);
		return getFromDB(userName);
	}

	private User getFromDB(String acctName) {
		System.out.println("real querying db..." + acctName);
		return new User(acctName);
	}
	
	/**
	 * ��������û������ʱ���������ݣ�������ˣ�ֱ�ӳ建���л�ȡ���������ݣ�����ִ�з�����
	 * @param loginSession
	 * @return
	 */
	@Cacheable(value = "demoCache",key="#loginSession.loginName")
	public LoginSession getLoginSession(LoginSession loginSession){
		return loginSession;
	}
	
	@CachePut(value = "demoCache",key="#loginSession.loginName")
	public LoginSession updateLoginSession(LoginSession loginSession){
		return loginSession;
	}
}
