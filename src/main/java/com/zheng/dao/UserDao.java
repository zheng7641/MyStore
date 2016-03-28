package com.zheng.dao;

import org.springframework.stereotype.Component;

import com.zheng.entity.User;

@Component
public interface UserDao {

	public int add(User user);
	
	public User getByName(String name);
	
	public User getUserAndRoleByUserName(String userName);
	
	public int getUserIdByName(String userName);
}
