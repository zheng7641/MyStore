package com.zheng.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int userId;
	private String userName;
	private String password;

	private String nickName;
	private String sex;
	private String phone;
	private String location;
	private String createTime;
	private String email;

	private List<Role> roleList;
	private List<GoodsMessage> goodsMessageList;
	private List<Goods> goodsList;

	public User() {
		super();
	}

	public User(String userName, String password, String nickName, String sex, String phone, String location,
			String createTime, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
		this.createTime = createTime;
		this.email = email;
	}

	public User(int userId, String userName, String password, String nickName, String sex, String phone,
			String location, String createTime, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
		this.createTime = createTime;
		this.email = email;
	}

	public User(String userName, String password, String nickName, String sex, String phone, String location,
			String createTime, String email, List<Role> roleList, List<GoodsMessage> goodsMessageList,
			List<Goods> goodsList) {
		super();
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
		this.createTime = createTime;
		this.email = email;
		this.roleList = roleList;
		this.goodsMessageList = goodsMessageList;
		this.goodsList = goodsList;
	}

	public User(int userId, String userName, String password, String nickName, String sex, String phone,
			String location, String createTime, String email, List<Role> roleList, List<GoodsMessage> goodsMessageList,
			List<Goods> goodsList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.location = location;
		this.createTime = createTime;
		this.email = email;
		this.roleList = roleList;
		this.goodsMessageList = goodsMessageList;
		this.goodsList = goodsList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public List<GoodsMessage> getGoodsMessageList() {
		return goodsMessageList;
	}

	public void setGoodsMessageList(List<GoodsMessage> goodsMessageList) {
		this.goodsMessageList = goodsMessageList;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", nickName=" + nickName
				+ ", sex=" + sex + ", phone=" + phone + ", location=" + location + ", createTime=" + createTime
				+ ", email=" + email + ", roleList=" + roleList + ", goodsMessageList=" + goodsMessageList
				+ ", goodsList=" + goodsList + "]";
	}

}
