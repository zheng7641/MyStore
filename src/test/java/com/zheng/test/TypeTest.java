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
	
	@Test
	public void getTypeTree(){
		List<Type> typeList = typeDao.getTypeTree("238");
		System.out.println(typeList);
	}
	
	@Test
	public void getByLevel(){
		List<Type> typeList = typeDao.getByLevel(3);
		for(Type t:typeList){
			System.out.println("<option value=\""+t.getTypeName()+"\">"+t.getTypeName()+"</option>");
		}
	}
	
	@Test
	public void getTypeid(){
		Type type = typeDao.getByName("ÀºÇò");
		System.out.println(type);
	}
	
	@Test
	public void getTypeName(){
		String typeName = typeDao.getTypeName(2);
		System.out.println(typeName);
	}
}
