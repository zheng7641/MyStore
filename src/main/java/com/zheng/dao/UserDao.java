package com.zheng.dao;

import org.springframework.stereotype.Component;

import com.zheng.entity.User;

@Component
public interface UserDao {

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return 用户总数
	 */
	public int add(User user);

	/**
	 * 删除用户
	 * 
	 * @param userName
	 * @return 总数
	 */
	public int delete(String userName);
	
	/**
	 * 删除用户的所有角色
	 * 
	 * @param userName
	 * @return 总数
	 */
	public int deleteRole(String userName);
	
	/**
	 * 修改用户信息
	 * 
	 * @param User
	 * @return 总数
	 */
	public int update(User user);
	
	/**
	 * 获取用户通过用户名
	 * 
	 * @param name
	 * @return User
	 */
	public User get(String userName);

	/**
	 * 获取用户和用户的所有角色
	 * 
	 * @param userName
	 * @return User
	 */
	public User getUserAndRole(String userName);

	/**
	 * 获取用户ID通过用户账号
	 * 
	 * @param userName
	 * @return 用户ID
	 */
	public int getId(String userName);
	
	/**
	 * 查看用户名是否存在
	 * 
	 * @param userName
	 * @return count(userName)
	 */
	public int isExist(String userName);
}
