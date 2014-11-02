package com.smart.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreServingAspect {
	@Before("execution(* serveTo(..))")
	public void beforeServing(){
		System.out.println("Before Serving...");
	}
}
