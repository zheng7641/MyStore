package com.zheng.entity;

import org.springframework.stereotype.Component;

@Component
public class UserMessage {

	private int userId;
	private String nickName;
	private String sex;
	private String phone;
	private String location;

	private User user;

	public UserMessage() {
		super();
	}

	public UserMessage(String nickName, String sex, String phone, String location) {
		super();
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
	}

	public UserMessage(int userId, String nickName, String sex, String phone, String location) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
	}

	public UserMessage(int userId, String nickName, String sex, String phone, String location, User user) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
		this.user = user;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserMessage [userId=" + userId + ", nickName=" + nickName + ", sex=" + sex + ", phone=" + phone
				+ ", location=" + location + ", user=" + user + "]";
	}

}
