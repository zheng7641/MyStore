package com.zheng.service;

import com.zheng.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService extends BaseService<User> {

	public User getUserAndRoleByUserName(String userName);
	
	public void add(User user);
}
