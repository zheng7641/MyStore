package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.ImagesDao;
import com.zheng.dao.OrderDao;
import com.zheng.entity.OrderResultSet;
import com.zheng.service.OrderService;

@Component
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;
	
	@Resource
	private ImagesDao imagesDao;
	
	public int deleteOrder(int goodsId) {
		return orderDao.deleteByGoodsId(goodsId);
	}

	public int getSumOrder(int userId) {
		return orderDao.getSumOrder(userId);
	}

	public int delete(int userId, int goodsId) {
		return orderDao.delete(userId, goodsId);
	}
	
	public void deleteAll(int userId){
		orderDao.deleteAll(userId);
	}

	public List<OrderResultSet> getList(int first, int number) {
		return orderDao.getList(first, number);
	}

	public int getCount() {
		return orderDao.getCount();
	}
}
