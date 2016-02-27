package com.zheng.dao;

import com.zheng.entity.User;

public interface UserDao extends BaseDao<User>{

	public User login(User user);
}
