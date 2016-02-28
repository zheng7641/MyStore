package com.zheng.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zheng.entity.User;
import com.zheng.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

	private UserServiceImpl UserServiceTest;

	@Resource
	public void setUserServiceTest(UserServiceImpl userServiceTest) {
		UserServiceTest = userServiceTest;
	}

	@Test
	public void test() {
		User user = UserServiceTest.getByName("aaa");
		System.out.println(user);
	}
}
