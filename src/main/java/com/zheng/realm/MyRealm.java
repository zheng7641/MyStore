package com.zheng.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/*
 * ��Shiro�У�������ͨ��Realm����ȡӦ�ó����е��û�����ɫ��Ȩ����Ϣ�ġ�
 * ͨ������£���Realm�л�ֱ�Ӵ����ǵ�����Դ�л�ȡShiro��Ҫ����֤��Ϣ��
 * ����˵��Realm��ר���ڰ�ȫ��ܵ�DAO. 
 */
public class MyRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
