package com.spring.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.smart.bean.LoginSession;
import com.spring.domain.User;

public class UserService {
	
	// 使用了一个缓存名叫 demoCache
	@Cacheable(value = "demoCache")
	public User getAccountByName(String userName) {
		// 方法内部实现不考虑缓存逻辑，直接实现业务
		System.out.println("real query account." + userName);
		return getFromDB(userName);
	}

	private User getFromDB(String acctName) {
		System.out.println("real querying db..." + acctName);
		return new User(acctName);
	}
	
	/**
	 * 当缓存中没有数据时，保存数据，如果有了，直接冲缓存中获取并返回数据，而不执行方法体
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
