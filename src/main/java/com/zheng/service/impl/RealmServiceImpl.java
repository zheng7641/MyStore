package com.zheng.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import com.zheng.dao.RealmDao;
import com.zheng.service.RealmService;

public class RealmServiceImpl implements RealmService {

	@Resource
	private RealmDao realmDao;

	public Set<String> getRoleByUserName(String userName) {
		return realmDao.getRoleByUserName(userName);
	}

}
