package com.zheng.service;

import java.util.List;

import com.zheng.entity.Order;
import com.zheng.entity.OrderResultSet;

public interface OrderService {

	public int deleteOrder(int goodsId);
	
	public int getSumOrder(int userId);
	
	public int delete(int userId,int goodsId);
	
	public void deleteAll(int userId);
	
	public List<OrderResultSet> getList(int first,int number);
	
	public int getCount();
	
	public void add(Order order);
}
