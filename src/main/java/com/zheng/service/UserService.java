package com.zheng.service;

import com.zheng.entity.User;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserService{

	public User getUserAndRoleByUserName(String userName);
	
	public void add(User user);
	
	public int getUserId(String userName);
	
	public List<User> getAll(String page,String number);
	
	public int getCount();
	
	public void update(User user);
	
	public void deleteById(String ids);
}
