package com.zheng.dao;

import org.springframework.stereotype.Component;

import com.zheng.entity.User;

@Component
public interface UserDao extends BaseDao<User> {

	public User getUserAndRoleByUserName(String userName);
	
	public int getUserIdByName(String userName);
}
