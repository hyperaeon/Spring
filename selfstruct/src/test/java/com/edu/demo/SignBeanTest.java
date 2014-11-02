package com.edu.demo;

import com.smart.bean.SignBean;

public class SignBeanTest {

	public static void main(String[] args){
		SignBean s1 = new SignBean();
		s1.setLoginName("abc");
		s1.setHost("127.0.0.1");
		SignBean s2 = new SignBean();
		s2.setLoginName("abc");
		s2.setHost("127.0.0.1");
		System.out.println(s1.equals(s2));
		
	}
}
