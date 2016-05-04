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
	private int userId;
	private int goodsId;
	private List<User> userList;
	private List<Goods> goodsList;

	public Order() {
		super();
	}

	public Order(int userId, int goodsId, List<User> userList, List<Goods> goodsList) {
		super();
		this.userId = userId;
		this.goodsId = goodsId;
		this.userList = userList;
		this.goodsList = goodsList;
	}

	public Order(int orderId, int userId, int goodsId, List<User> userList, List<Goods> goodsList) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.goodsId = goodsId;
		this.userList = userList;
		this.goodsList = goodsList;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
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
		return "Order [orderId=" + orderId + ", userId=" + userId + ", goodsId=" + goodsId + ", userList=" + userList
				+ ", goodsList=" + goodsList + "]";
	}

}
