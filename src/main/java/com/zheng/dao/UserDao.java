package com.zheng.dao;

import com.zheng.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends BaseDao<User> {

	public User getUserAndRoleByUserName(String userName);
}
