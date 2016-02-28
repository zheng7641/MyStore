package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.RoleDao;
import com.zheng.service.RoleService;

@Component
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;

	public List<String> getRoleByUserName(String userName) {
		return roleDao.getRoleByUserName(userName);
	}
	
}
