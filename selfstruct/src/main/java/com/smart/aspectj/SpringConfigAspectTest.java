package com.smart.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.advisor.Waiter;

public class SpringConfigAspectTest {

	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspect-bean.xml");
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("Oliver");
	}
}
