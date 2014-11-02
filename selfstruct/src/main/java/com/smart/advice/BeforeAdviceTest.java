package com.smart.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAdviceTest {

	private Waiter waiter;
	private BeforeAdvice advice;
	private ProxyFactory p;
	
	@BeforeTest
	public void init(){
		waiter = new NaiveWaiter();
		advice = new GreetingBeforeAdvice();
		p = new ProxyFactory();
		p.setTarget(waiter);
		p.addAdvice(advice);
	}
	
	@Test
	public void greet(){
		Waiter proxy = (Waiter)p.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("Tome");
	}
}
