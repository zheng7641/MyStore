package com.zheng.realm;

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
import com.zheng.service.impl.RealmServiceImpl;
import com.zheng.service.impl.UserServiceImpl;
/*
 * ��Shiro�У�������ͨ��Realm����ȡӦ�ó����е��û�����ɫ��Ȩ����Ϣ�ġ�
 * ͨ������£���Realm�л�ֱ�Ӵ����ǵ�����Դ�л�ȡShiro��Ҫ����֤��Ϣ��
 * ����˵��Realm��ר���ڰ�ȫ��ܵ�DAO. 
 */

@Component
public class MyRealm extends AuthorizingRealm {

	@Resource
	private RealmServiceImpl realmServiceImpl;
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
		authorizationInfo.setRoles(realmServiceImpl.getRoleByUserName(userName));
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
		User user = userServiceImpl.getByName(userName);
		System.out.println(user);
		if (user != null) {
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), "salt");
			return authcInfo;
		} else {
			return null;
		}
	}

}
