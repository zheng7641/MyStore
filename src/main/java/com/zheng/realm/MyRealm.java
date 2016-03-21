package com.zheng.realm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.zheng.entity.User;
import com.zheng.service.impl.RoleServiceImpl;
import com.zheng.service.impl.UserServiceImpl;
/*
 * ��Shiro�У�������ͨ��Realm����ȡӦ�ó����е��û�����ɫ��Ȩ����Ϣ�ġ�
 * ͨ������£���Realm�л�ֱ�Ӵ����ǵ�����Դ�л�ȡShiro��Ҫ����֤��Ϣ��
 * ����˵��Realm��ר���ڰ�ȫ��ܵ�DAO. 
 */

@Component
public class MyRealm extends AuthorizingRealm {

	@Resource
	private RoleServiceImpl roleServiceImpl;
	@Resource
	private UserServiceImpl userServiceImpl;

	/*
	 * ��Ȩ
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
	 * .shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		List<String> roleList = roleServiceImpl.getRoleByUserName(userName);
		for(String role:roleList){
			authorizationInfo.addRole(role);
		}
		return authorizationInfo;
	}

	/*
	 * ��½
	 * 
	 * @see
	 * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.
	 * apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();
		User user = userServiceImpl.getUserAndRoleByUserName(userName);
		System.out.println(user);
		if (user != null) {
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), "cnmgpjwmz");
			return authcInfo;
		} else {
			return null;
		}
	}
}
