package com.smart.schema;

public class AdviceMethods {

	public void preGreeting(String name){
		System.out.println("How are you ");
		System.out.println(name);
	}
	
	public void afterReturning(int retVal){
		System.out.println("---after returning()----");
		System.out.println("returnValue:" + retVal);
		System.out.println("---after returning()----");
	}
	
	
}
