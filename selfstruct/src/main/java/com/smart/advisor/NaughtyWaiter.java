package com.smart.advisor;

public class NaughtyWaiter implements Waiter {

	@Override
	public void greetTo(String name) {
		System.out.println("NaughtyWaiter greeting to " + name);
	}

	@Override
	public void serveTo(String name) {
		System.out.println("NaughtyWaiter serving to " + name);
	}

}
