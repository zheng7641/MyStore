package com.zheng.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.RealmDao;
import com.zheng.entity.User;
import com.zheng.service.RealmService;

@Component
public class RealmServiceImpl implements RealmService {

	@Resource
	private RealmDao realmDao;

	public Set<String> getRoleByUserName(String userName) {
		return realmDao.getRoleByUserName(userName);
	}
	
	public User getByUserName(String userName){
		return realmDao.getByUserName(userName);
	}

}
