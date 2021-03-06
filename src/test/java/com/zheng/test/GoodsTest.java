package com.zheng.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
		List<Goods> goodsList = goodsDao.getByType("篮球",0,14);
		System.out.println(goodsList);
	}
	
	@Test
	public void getSpecialGoods(){
		List<Goods> goodsList = goodsDao.getSpecialGoods("篮球", 0, 14);
		System.out.println(goodsList.size());
		System.out.println(goodsList);
	}
	
	@Test
	public void getGoodsImgMsg(){
		List<Goods> goodsList = goodsDao.getGoodsImgMsg("篮球", 0, 14);
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
			Date currentTime = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String createTime = formatter.format(currentTime);
			goodsDao.add("篮球"+i, "商品简介商品简介商品简介商品简介商品简介商品简介商品简介商品简介"+i, Integer.valueOf(10*i), "质量"+i, "交易地点"+i,String.valueOf(i*1342),"交易方式"+i, createTime, 225,0);
		}
	}
	
	@Test
	public void getTotal(){
		int i = goodsDao.getTotal("篮球");
		System.out.println(i/16);
	}
	
	@Test
	public void getById(){
		Goods goods = goodsDao.getById(1);
		System.out.println(goods);
	}
	
	@Test
	public void getBySeller(){
		List<Goods> goodsList = goodsDao.getBySeller(0);
		List<Goods> goodsList1 = goodsList.subList(5, 10);
		for(Goods g:goodsList){
			System.out.println(g);
		}
		System.out.println("---------------------------------");
		for(Goods g:goodsList1){
			System.out.println(g);
		}
	}
	
	@Test
	public void getUserId(){
		int i = goodsDao.getUserId(1);
		System.out.println(i);
	}
	
	@Test
	public void getUUID(){
		System.out.println(UUID.randomUUID());
	}
	
	@Test
	public void getGoods(){
		List<Goods> goodsList = goodsDao.getGoods("篮球女女男男女女难求", 131,"博学", "1313131313", "阿斯顿发斯蒂芬");
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void getPublishNum(){
		int i = goodsDao.getPublishNum(1);
		System.out.println(i);
	}
	
	@Test
	public void getgetByUserId2(){
		int page = 1;
		List<Goods> goodsList = goodsDao.getByUserId2(1, 5*(page-1), 5);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void getOrderList(){
		List<Goods> goodsList = goodsDao.getOrderList(1, 0, 2);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void getList(){
		List<Goods> goodsList = goodsDao.getList(0, 10);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
	
	@Test
	public void getCount(){
		int count = goodsDao.getCount();
		System.out.println(count);
	}
	
	@Test
	public void getSearchCount(){
		int count = goodsDao.getSearchNum("冰箱");
		System.out.println(count);
	}
	
	@Test
	public void getSearchList(){
		List<Goods> goodsList = goodsDao.getSearchList("冰箱", 0, 5);
		for(Goods g:goodsList){
			System.out.println(g);
		}
	}
}
