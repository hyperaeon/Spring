package com.edu.demo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.bean.LoginSession;
import com.spring.domain.User;
import com.spring.service.UserService;

public class CacheableTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		System.out.print("first query...");
		System.out.println(userService.getAccountByName("somebody"));
		// 第二次查询，应该不查数据库，直接返回缓存的值
		System.out.print("second query...");
		System.out.println(userService.getAccountByName("somebody"));
		System.out.println();
		LoginSession loginSession = new LoginSession("abc","123");
		System.out.println(userService.getLoginSession(loginSession).getPasswod());
		
		LoginSession loginSession2 = new LoginSession("abc","1234");
		System.out.println(userService.getLoginSession(loginSession2).getPasswod());
		LoginSession _loginSession = userService.getLoginSession(loginSession2);
		if(!loginSession2.getPasswod().equals(_loginSession.getPasswod())){
			System.out.println("缓存中的为旧的信息需要更新");
			System.out.println(userService.updateLoginSession(loginSession2).getPasswod());
		}
		
	}
}
