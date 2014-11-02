package com.spring.utils;

import com.hazelcast.core.HazelcastInstance;

public class CacheUtil {

	public static final String CACHE_NAME = "hcCache";
	public static final String CACHE_ENABLE_KEY = CacheUtil.class
			+ ".cacheEnabled";
	private static HazelcastInstance hcInstance;
	
	private static HazelcastInstance getHcInstance() {
		if (hcInstance == null) {
			hcInstance = ApplicationContextUtil
					.getBean(HazelcastInstance.class);
		}
		return hcInstance;
	}
	
	public static boolean isCacheEnabled() {
		return getHcInstance().getAtomicLong(CACHE_ENABLE_KEY).get() == 0;
	}

	public static void enableCache() {
		getHcInstance().getAtomicLong(CACHE_ENABLE_KEY).set(0);
	}
	
	public static void disableCache() {
		getHcInstance().getAtomicLong(CACHE_ENABLE_KEY).set(1);
//		CommonBusinessUtil.init();
	}
	
	
}
