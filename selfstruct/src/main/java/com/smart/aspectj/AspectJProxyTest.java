package com.smart.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.smart.advisor.NaiveWaiter;
import com.smart.advisor.Waiter;

public class AspectJProxyTest {

	AspectJProxyFactory factory = null;
	@BeforeClass
	public void init(){
		Waiter waiter = new NaiveWaiter();
		factory = new AspectJProxyFactory();
		factory.setTarget(waiter);
		factory.addAspect(PreGreetingAspect.class);
		factory.addAspect(PreServingAspect.class);
	}
	@Test
	public void aspectJTest(){
		Waiter proxy = factory.getProxy();
		proxy.greetTo("Tom");
		proxy.serveTo("Sam");
	}
}
