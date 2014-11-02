package com.smart.schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.advisor.Waiter;

public class SchemaTest {

	public static void main(String[] args){
		String config = "spring-aop.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		Waiter naiveWaiter = (Waiter)ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter)ctx.getBean("naughtyWaiter");
		naiveWaiter.greetTo("Juxh");
		naughtyWaiter.greetTo("Lind");
	}
}
