package com.zheng.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class GoodsMessage {
	
	private int goodsMessageId;
	private int fatherMessageId;
	private String message;
	private Date createTime;
	private User user;
	private Goods goods;
	public GoodsMessage() {
		super();
	}
	public GoodsMessage(int fatherMessageId, String message, Date createTime, User user, Goods goods) {
		super();
		this.fatherMessageId = fatherMessageId;
		this.message = message;
		this.createTime = createTime;
		this.user = user;
		this.goods = goods;
	}
	public GoodsMessage(int goodsMessageId, int fatherMessageId, String message, Date createTime, User user,
			Goods goods) {
		super();
		this.goodsMessageId = goodsMessageId;
		this.fatherMessageId = fatherMessageId;
		this.message = message;
		this.createTime = createTime;
		this.user = user;
		this.goods = goods;
	}
	public int getGoodsMessageId() {
		return goodsMessageId;
	}
	public void setGoodsMessageId(int goodsMessageId) {
		this.goodsMessageId = goodsMessageId;
	}
	public int getFatherMessageId() {
		return fatherMessageId;
	}
	public void setFatherMessageId(int fatherMessageId) {
		this.fatherMessageId = fatherMessageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "GoodsMessage [goodsMessageId=" + goodsMessageId + ", fatherMessageId=" + fatherMessageId + ", message="
				+ message + ", createTime=" + createTime + ", user=" + user + ", goods=" + goods + "]";
	}
	
}
