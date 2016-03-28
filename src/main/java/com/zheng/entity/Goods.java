package com.zheng.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Goods {

	private int goodsId;
	private String goodsName;
	private String goodsDescription;
	private int price;
	private String quality;
	private String tradingPosition;
	private String contactInformation;
	private String businessDeal; // 交易方式
	private Date createTime;

	private Type type;
	private List<GoodsMessage> goodsMessage;
	private List<User> userList;
	private List<Images> imagesList;

	public Goods() {
		super();
	}

	public Goods(String goodsName, String goodsDescription, int price, String quality, String tradingPosition,
			String contactInformation, String businessDeal, Date createTime, Type type, List<GoodsMessage> goodsMessage,
			List<User> userList, List<Images> imagesList) {
		super();
		this.goodsName = goodsName;
		this.goodsDescription = goodsDescription;
		this.price = price;
		this.quality = quality;
		this.tradingPosition = tradingPosition;
		this.contactInformation = contactInformation;
		this.businessDeal = businessDeal;
		this.createTime = createTime;
		this.type = type;
		this.goodsMessage = goodsMessage;
		this.userList = userList;
		this.imagesList = imagesList;
	}

	public Goods(int goodsId, String goodsName, String goodsDescription, int price, String quality,
			String tradingPosition, String contactInformation, String businessDeal, Date createTime, Type type,
			List<GoodsMessage> goodsMessage, List<User> userList, List<Images> imagesList) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsDescription = goodsDescription;
		this.price = price;
		this.quality = quality;
		this.tradingPosition = tradingPosition;
		this.contactInformation = contactInformation;
		this.businessDeal = businessDeal;
		this.createTime = createTime;
		this.type = type;
		this.goodsMessage = goodsMessage;
		this.userList = userList;
		this.imagesList = imagesList;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDescription() {
		return goodsDescription;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getTradingPosition() {
		return tradingPosition;
	}

	public void setTradingPosition(String tradingPosition) {
		this.tradingPosition = tradingPosition;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getBusinessDeal() {
		return businessDeal;
	}

	public void setBusinessDeal(String businessDeal) {
		this.businessDeal = businessDeal;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<GoodsMessage> getGoodsMessage() {
		return goodsMessage;
	}

	public void setGoodsMessage(List<GoodsMessage> goodsMessage) {
		this.goodsMessage = goodsMessage;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Images> getImagesList() {
		return imagesList;
	}

	public void setImagesList(List<Images> imagesList) {
		this.imagesList = imagesList;
	}

	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsDescription=" + goodsDescription
				+ ", price=" + price + ", quality=" + quality + ", tradingPosition=" + tradingPosition
				+ ", contactInformation=" + contactInformation + ", businessDeal=" + businessDeal + ", createTime="
				+ createTime + ", type=" + type + ", goodsMessage=" + goodsMessage + ", userList=" + userList
				+ ", imagesList=" + imagesList + "]";
	}


}
