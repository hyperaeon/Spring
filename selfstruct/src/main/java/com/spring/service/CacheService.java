package com.spring.service;

import org.apache.shiro.session.Session;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.utils.CacheUtil;
@Service
public class CacheService {

	@Cacheable(value=CacheUtil.CACHE_NAME,key="#session.id")
	public Session getSession(Session session){
		return session;
	}
	
}
