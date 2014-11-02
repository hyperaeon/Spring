package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.smart.domain.User;

@Controller
@RequestMapping(value="/user")
@SessionAttributes("user")
public class UserController {

	@RequestMapping(value="/handleModel")
	public String handleModle(@ModelAttribute("user") User user){
		user.setUserId(101);
		return "/user/createSuccess";
	}
	
	@ModelAttribute("user")
	public User getUser(){
		User user = new User();
		user.setUserId(1000);
		return user;
	}
	
	@RequestMapping(value="/handleModle3")
	public String handleModle3(ModelMap modleMap){
		modleMap.addAttribute("testAttr","value1");
		User user = (User)modleMap.get("user");
		user.setUserName("EOM");
		return "/user/showUser";
	}
	
	@RequestMapping("/handleModle4")
	public String handleModle4(ModelMap modleMap,SessionStatus status){
		User user = (User)modleMap.get("user");
		if(user != null){
			user.setUserName("Jetty");
			status.setComplete();
		}
		return "/user/showUser";
	}
}
