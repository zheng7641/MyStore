package com.zheng.entity;

import org.springframework.stereotype.Component;

@Component
public class Images {

	private int imagesId;
	private String imagesUrl;
	private Goods goods;
	public Images() {
		super();
	}
	public Images(String imagesUrl, Goods goods) {
		super();
		this.imagesUrl = imagesUrl;
		this.goods = goods;
	}
	public Images(int imagesId, String imagesUrl, Goods goods) {
		super();
		this.imagesId = imagesId;
		this.imagesUrl = imagesUrl;
		this.goods = goods;
	}
	public int getImagesId() {
		return imagesId;
	}
	public void setImagesId(int imagesId) {
		this.imagesId = imagesId;
	}
	public String getImagesUrl() {
		return imagesUrl;
	}
	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "Images [imagesId=" + imagesId + ", imagesUrl=" + imagesUrl + ", goods=" + goods + "]";
	}
	
	
}
