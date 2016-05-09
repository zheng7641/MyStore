package com.zheng.entity;

public class OrderResultSet {

	private int orderId;// ¶©µ¥ºÅ
	private int userId;// ¶©µ¥ÈËID
	private String nickName;
	private String goodsName;
	private String price;

	public OrderResultSet() {
		super();
	}

	public OrderResultSet(int orderId, int userId, String nickName, String goodsName, String price) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.nickName = nickName;
		this.goodsName = goodsName;
		this.price = price;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderResultSet [orderId=" + orderId + ", userId=" + userId + ", nickName=" + nickName + ", goodsName="
				+ goodsName + ", price=" + price + "]";
	}

}
