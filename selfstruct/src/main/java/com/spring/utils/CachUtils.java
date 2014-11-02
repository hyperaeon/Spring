package com.spring.utils;

import net.sf.ehcache.CacheManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;

public class CachUtils {

	private CacheManager ehCacheManager;// cacheManager

	// ����Spring��CacheManager
	private EhCacheCacheManager cacheCacheManager = new EhCacheCacheManager();

	public void setCacheManager() {
		cacheCacheManager.setCacheManager(ehCacheManager);
	}

}
