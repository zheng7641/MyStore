package com.zheng.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Type {

	private int typeId;
	private int fatherTypeId;
	private String typeName;

	private List<Goods> goodsList;

	public Type() {
		super();
	}

	public Type(int fatherTypeId, String typeName, List<Goods> goodsList) {
		super();
		this.fatherTypeId = fatherTypeId;
		this.typeName = typeName;
		this.goodsList = goodsList;
	}

	public Type(int typeId, int fatherTypeId, String typeName, List<Goods> goodsList) {
		super();
		this.typeId = typeId;
		this.fatherTypeId = fatherTypeId;
		this.typeName = typeName;
		this.goodsList = goodsList;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getFatherTypeId() {
		return fatherTypeId;
	}

	public void setFatherTypeId(int fatherTypeId) {
		this.fatherTypeId = fatherTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", fatherTypeId=" + fatherTypeId + ", typeName=" + typeName + ", goodsList="
				+ goodsList + "]";
	}

}
