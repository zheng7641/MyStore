package com.zheng.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class LoginLog {

	private int logId;
	private User user;
	private Date createTime;
	private String ip;

	public LoginLog() {
		super();
	}

	public LoginLog(User user, Date createTime, String ip) {
		super();
		this.user = user;
		this.createTime = createTime;
		this.ip = ip;
	}

	public LoginLog(int logId, User user, Date createTime, String ip) {
		super();
		this.logId = logId;
		this.user = user;
		this.createTime = createTime;
		this.ip = ip;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "LoginLog [logId=" + logId + ", user=" + user + ", createTime=" + createTime + ", ip=" + ip + "]";
	}

}
