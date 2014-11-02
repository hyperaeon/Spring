package com.smart.advisor;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAdvisorTest {

	private Waiter waiter;
	private GreetingAdvisor advisor;
	private BeforeAdvice advice;
	private ProxyFactory proxy;
	
	@BeforeTest
	public void init(){
		waiter = new NaiveWaiter();
		advisor = new GreetingAdvisor();
		advice = new GreetingBeforeAdvice();
		proxy = new ProxyFactory();
		proxy.setTarget(waiter);
		advisor.setAdvice(advice);//将增加添加到切面中
		proxy.addAdvice(advice);
		proxy.addAdvisor(advisor);
	}
	
	@Test
	public void greeting(){
		Waiter w = (Waiter)proxy.getProxy();
		
		w.greetTo("Lieo");
	}
}
