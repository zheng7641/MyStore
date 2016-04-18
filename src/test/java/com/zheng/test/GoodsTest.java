package com.zheng.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.dao.GoodsDao;
import com.zheng.entity.Goods;

public class GoodsTest {

	private GoodsDao goodsDao;
	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		goodsDao = (GoodsDao) context.getBean("goodsDao");
	}
	
	@Test
	public void getByType(){
		List<Goods> goodsList = goodsDao.getByType("����",0,14);
		System.out.println(goodsList);
	}
	
	@Test
	public void getSpecialGoods(){
		List<Goods> goodsList = goodsDao.getSpecialGoods("����", 0, 14);
		System.out.println(goodsList.size());
		System.out.println(goodsList);
	}
	
	@Test
	public void getGoodsImgMsg(){
		List<Goods> goodsList = goodsDao.getGoodsImgMsg("����", 0, 14);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void getNewGoods(){
		List<Goods> goodsList = goodsDao.getNewGoods(0, 5);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void setGoods(){
		for(int i = 36;i < 100;i++){
			goodsDao.add("����"+i, "��Ʒ�����Ʒ�����Ʒ�����Ʒ�����Ʒ�����Ʒ�����Ʒ�����Ʒ���"+i, Integer.valueOf(10*i), "����"+i, "���׵ص�"+i,String.valueOf(i*1342),"���׷�ʽ"+i, new Date(), 225);
		}
	}
}
