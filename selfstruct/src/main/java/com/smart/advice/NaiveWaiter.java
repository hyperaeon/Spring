package com.smart.advice;

public class NaiveWaiter implements Waiter {

	@Override
	public void greetTo(String name) {
		System.out.println("Greeting to " + name);
	}

	@Override
	public void serveTo(String name) {
		System.out.println("Serving to " + name);
	}

}
