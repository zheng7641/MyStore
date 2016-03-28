package com.zheng.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class GoodsAccessLog {

	private int logId;
	private User user;
	private Goods goods;
	private Date createTime;

	public GoodsAccessLog() {
		super();
	}

	public GoodsAccessLog(User user, Goods goods, Date createTime) {
		super();
		this.user = user;
		this.goods = goods;
		this.createTime = createTime;
	}

	public GoodsAccessLog(int logId, User user, Goods goods, Date createTime) {
		super();
		this.logId = logId;
		this.user = user;
		this.goods = goods;
		this.createTime = createTime;
	}

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "GoodsAccessLog [logId=" + logId + ", user=" + user + ", goods=" + goods + ", createTime=" + createTime
				+ "]";
	}

}
