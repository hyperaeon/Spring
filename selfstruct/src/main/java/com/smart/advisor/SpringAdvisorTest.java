package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAdvisorTest {

	public static void main(String[] args){
		String path = "bean1.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("JOIEJF");
		waiter.serveTo("JOE");
	}
}
