package com.smart.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smart.bean.UserBean;
import com.smart.domain.User;
import com.smart.service.SessionService;
import com.smart.service.UserService;
import com.spring.service.CacheService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private CacheService cacheService;
	
	@Autowired
	private SessionService sessionService;

	@RequestMapping(value = "/login.html")
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request, UserBean userBean) {
		UsernamePasswordToken token = new UsernamePasswordToken(
				userBean.getUserName(), userBean.getPassword());
		Subject currentUser = SecurityUtils.getSubject();
		Session shiroSession = currentUser.getSession();
//		System.out.println(cacheService.getSession(shiroSession));
//		Session shiroSession2 = currentUser.getSession();
//		System.out.println(cacheService.getSession(shiroSession2));
		
		sessionService.getOnlineNames();
		
		shiroSession.setAttribute("user", userBean);
		try {
			currentUser.login(token);// 执行后跳入MonitorRealm类中的认证方法
		} catch (AuthenticationException e) {
			throw new AccountException("Login failed");
		}
		if (!userService.hasMatchUser(userBean.getUserName(),
				userBean.getPassword())) {
			return new ModelAndView("login", "error", "用户名或密码错误");
		} else {
			User user = userService.findUserByName(userBean.getUserName());
			user.setLastIp(request.getRemoteAddr());
			user.setLastVisit(new Date());
			// userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
	}

}
