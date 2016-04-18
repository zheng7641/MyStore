package com.zheng.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.dao.TypeDao;
import com.zheng.entity.Type;

public class TypeTest {

	
	TypeDao typeDao;
	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		typeDao = (TypeDao) context.getBean("typeDao");
	}
	
	@Test
	public void getAllTest(){
		List<Type> typeList = typeDao.getAll();
		System.out.println(typeList);
	}
}
