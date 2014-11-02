package com.spring.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ApplicationContextUtil implements ApplicationContextAware{

	private static ApplicationContext applicationContext;

	public static <T> T getBean(Class<T> clz) {
		return applicationContext.getBean(clz);
	}

	public static <T> T getBean(String name, Class<T> clz) {
		return applicationContext.getBean(name, clz);
	}

	@Override
	public void setApplicationContext(
			final ApplicationContext applicationContext) {
		ApplicationContextUtil.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
