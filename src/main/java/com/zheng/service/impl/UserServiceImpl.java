package com.zheng.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.RoleDao;
import com.zheng.dao.UserDao;
import com.zheng.entity.User;
import com.zheng.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	private static final int ADMIN = 1;
	private static final int YOUKE = 2;
	
	@Resource
	private UserDao userDao;
	
	@Resource
	private RoleDao roleDao;
	
	public void add(User user) {
		userDao.add(user);
		int userId = userDao.getUserIdByName(user.getUserName());
		roleDao.addRole(userId, YOUKE);
	}

	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByName(String name) {
		return userDao.getByName(name);
	}

	public List<String> getStringById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getStringByString(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> get(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getTotal(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserAndRoleByUserName(String userName) {
		return userDao.getUserAndRoleByUserName(userName);
	}

}
