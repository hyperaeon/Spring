package com.smart.advisor;

public class NaiveWaiter implements Waiter {

	public void greetTo(String name){
		System.out.println("waiter greet to " + name);
	}
	
	public void serveTo(String name){
		System.out.println("waiter serve to " + name);
	}
}
