package com.zheng.dao;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface RoleDao{

	public List<String> getRoleByUserName(String userName);
	
}
