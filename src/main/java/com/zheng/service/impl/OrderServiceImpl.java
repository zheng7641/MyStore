package com.zheng.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.ImagesDao;
import com.zheng.dao.OrderDao;
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
}
