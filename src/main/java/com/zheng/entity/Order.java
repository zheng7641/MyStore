package com.zheng.entity;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * ¹ºÎï³µ
 * 
 * @author zheng
 *
 */
@Component
public class Order {

	private int orderId;
	private List<User> userList;
	private List<Goods> goodsList;

	public Order() {
		super();
	}

	public Order(List<User> userList, List<Goods> goodsList) {
		super();
		this.userList = userList;
		this.goodsList = goodsList;
	}

	public Order(int orderId, List<User> userList, List<Goods> goodsList) {
		super();
		this.orderId = orderId;
		this.userList = userList;
		this.goodsList = goodsList;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userList=" + userList + ", goodsList=" + goodsList + "]";
	}

}
