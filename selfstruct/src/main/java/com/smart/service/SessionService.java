package com.smart.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

	@Autowired
	private SessionDAO sessionDAO;
	
	public Set<String> getOnlineNames(){
		Collection<Session> sessions = sessionDAO.getActiveSessions();
		System.out.println("-------Session¸öÊý£º" + sessions.size());
		Iterator<Session> it = sessions.iterator();
		Set<String> loginNames = new HashSet<>();
		while(it.hasNext()){
			Session session = it.next();
			String str = session.getId().toString();
			loginNames.add(str);
			System.out.println("SessionId " + str);
			System.out.println("SessionStartTimestamp " + session.getStartTimestamp());
			System.out.println("SessionTimeout " + session.getTimeout());
			System.out.println("SessionLastAccessTime " + session.getLastAccessTime());
		}
		return loginNames;
	}
}
