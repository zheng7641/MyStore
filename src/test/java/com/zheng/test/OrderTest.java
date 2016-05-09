package com.zheng.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.dao.OrderDao;
import com.zheng.entity.Goods;
import com.zheng.entity.OrderResultSet;

public class OrderTest {

	private OrderDao orderDao;
	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		orderDao = (OrderDao) context.getBean("orderDao");
	}
	
	@Test
	public void getOrderList(){
		List<Goods> orderList = orderDao.getOrderList(1,1,1);
		for(Goods o:orderList){
			System.out.println(o);
		}
	}
	
	@Test
	public void delete(){
		orderDao.delete(1, 25);
	}
	
	@Test
	public void deleteAll(){
		orderDao.deleteAll(1);
	}
	
	@Test
	public void getList(){
		List<OrderResultSet> orderList = orderDao.getList(0, 3);
		for(OrderResultSet o:orderList){
			System.out.println(o);
		}
	}
	
	@Test
	public void getCount(){
		System.out.println(orderDao.getCount());
	}
}
