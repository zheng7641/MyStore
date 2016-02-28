package com.zheng.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.entity.User;
import com.zheng.service.RoleService;
import com.zheng.service.impl.UserServiceImpl;

public class UserTest {
	
	RoleService roleServiceImpl;
	UserServiceImpl userServiceImpl;
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		roleServiceImpl = (RoleService) context.getBean("roleServiceImpl");
		userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");
	}

	@Test
	public void test() {
		User user = new User("bbb","ccc");
		userServiceImpl.add(user);
	}

}
