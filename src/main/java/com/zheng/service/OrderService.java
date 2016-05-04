package com.zheng.service;

public interface OrderService {

	public int deleteOrder(int goodsId);
	
	public int getSumOrder(int userId);
	
	public int delete(int userId,int goodsId);
}
