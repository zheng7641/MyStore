package com.zheng.dao;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.zheng.entity.User;

@Component
public interface RealmDao{

	public Set<String> getRoleByUserName(String userName);
	
	public User getByUserName(String userName);
}
