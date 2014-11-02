package com.smart.aop;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.bean.LoginBean;
import com.smart.bean.UserBean;
import com.smart.service.UserService;
/**
 * 
 * @author Oliver
 * shiro¿πΩÿ
 */
@Service("MonitorRealm")
public class MonitorRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;
	/**
	 *  ⁄»®
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * »œ÷§
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken) throws AuthenticationException {
		Session shiroSession = SecurityUtils.getSubject().getSession();
		UserBean user = (UserBean)shiroSession.getAttribute("user");
		LoginBean loginBean = userService.getInfoByName(user.getUserName(),shiroSession.getHost());
		shiroSession.setAttribute("loginBean", loginBean);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
		info.setCredentialsSalt(ByteSource.Util.bytes(user.getUserName()));
		return info;
	}

}
