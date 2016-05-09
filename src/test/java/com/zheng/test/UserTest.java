package com.zheng.test;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.zheng.dao.RoleDao;
import com.zheng.dao.UserDao;
import com.zheng.entity.User;

public class UserTest {

	UserDao userDao;
	
	RoleDao roleDao;
	
	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		userDao = (UserDao) context.getBean("userDao");
		roleDao = (RoleDao) context.getBean("roleDao");
	}

	@Test
	public void addUser() {
		String userName = "zhangsan";
		String password = "123";
		String nickName = "张三";
		String sex = "男";
		String phone = "131111111111";
	    String location = "地址是哪里";
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String createTime = formatter.format(currentTime);
	    String email = "zheng@153.com";
		User user = new User(userName,password,nickName,sex,phone,location,createTime,email);
		System.out.println(userDao.add(user));
	}
	
	@Test
	public void getUserByName(){
		User user = userDao.get("zhangsan");
		System.out.println(user);
	}
	
	@Test
	public void getUserAndRoleByUserName(){
		System.out.println(userDao.getUserAndRole("zhangsan"));
	}
	
	@Test
	public void getUserIdByName(){
		System.out.println(userDao.getId("zhangsan"));
	}
	
	@Test
	public void update(){
		int userId = 1;
		String userName = "zhangsan";
		String password = "123111";
		String nickName = "张三feng";
		String sex = "男";
		String phone = "132222";
	    String location = "地址是哪里2222";
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String createTime = formatter.format(currentTime);
	    String email = "zheng@153.com";
		User user = new User(userId,userName,password,nickName,sex,phone,location,createTime,email);
		System.out.println(userDao.update(user));
	}
	
	@Test
	public void deleteRole(){
		System.out.println(userDao.deleteRole("zhangsan"));
	}
	
	@Test
	@Transactional
	public void delete(){
		userDao.deleteRole("zhangsan");
		userDao.delete("zhangsan123");
	}
	
	@Test
	public void deleteById(){
		roleDao.deleteRoleByUserId(17);
		userDao.deleteById(17);
	}
	
	@Test
	public void isExist(){
		assertEquals(1, userDao.isExist("zhangsan"));
	}
	
	@Test
	public void getAll(){
		//System.out.println(userDao.getAll(0,3));
	}
	
	@Test
	public void getCount(){
		System.out.println(userDao.getCount());
	}
}
