package com.smart.service;

import java.util.List;

//import net.sf.ehcache.Cache;
//import net.sf.ehcache.CacheManager;
//import net.sf.ehcache.Element;





import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.smart.bean.LoginBean;
import com.smart.bean.SignBean;
import com.smart.dao.UserMapper;
import com.smart.domain.User;
import com.smart.domain.UserExample;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	

	@Autowired
	private CacheManager ehCacheManager;
	
//	@Cacheable(value="demoCache")
	public User findUserByName(String name){
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(name);
		List<User> userList = userMapper.selectByExample(userExample);
		if(!CollectionUtils.isEmpty(userList)){
			return userList.get(0);
		}
		return null;
	}
	
	public boolean hasMatchUser(String name,String password){
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(name).andPasswordEqualTo(password);
		if(userMapper.countByExample(userExample) > 0){
			return true;
		}
		return false;
	}
	
	/**
	 * �����û�����ȡ�û�����
	 * @param name
	 * @return
	 */
	public String getPassword(String name){
		User user = findUserByName(name);
		if(null != user){
			return user.getPassword();
		}
		return null;
	}
	
	/**
	 * ��ȡ��¼��Ϣ
	 * @param name
	 * @return
	 */
	public LoginBean getInfoByName(String name,String host){
//		CacheManager manager = CacheManager.create();
//		Element element = new Element("key", "value");
//		Cache cache = new Cache("test", 1, true, false, 5, 2);
//		manager.addCache(cache);
//		cache.put(element);
//		Element element1 = new Element("key1", "value");
//		cache.put(element1);
//		System.out.println("----cache��-----" + cache.getSize());
//		System.out.println("----cache��element��-----" + cache.getMemoryStoreSize());
		
		/**��ehcache.xml�����л�ȡ����*/
//		Cache userCache = ehCacheManager.getCache("demoCache");
//		SignBean signBean = new SignBean();
//		signBean.setLoginName(name);
//		signBean.setHost(host);
//		
//		if(userCache.get(signBean) != null){
//			userCache.evict(signBean);
//			System.out.println("----userCache�Ƴ�signBean�������Ԫ�ظ�����-----" );
//		}
//		
//		Element userElement = new Element(signBean,"value");
//		userCache.put(name,host);
//		
//		signBean.setLoginName("name");
//		signBean.setHost(host);
//		userElement = new Element(signBean,"value");
//		userCache.put(name,host);
//		
//		System.out.println("----userCache������Ԫ�ظ�����-----" + userCache.getName());
//		System.out.println("----userCache�Ƿ����signBean��-----" + (userCache.get(signBean) == null ? "��" : "��"));
//		
//		
//	
		
		User user = findUserByName(name);
		if(null != user){
			LoginBean loginBean = new LoginBean();
			loginBean.setUserName(user.getUserName());
			loginBean.setLastVisit(user.getLastVisit());
			return loginBean;
		}
		return null;
	}
}
