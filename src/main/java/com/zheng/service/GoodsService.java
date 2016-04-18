package com.zheng.service;

import java.util.List;

import com.zheng.entity.Goods;

public interface GoodsService {

	public List<Goods> getByType(String typeName,int first,int number);
	
	public List<Goods> getHotGoods();
	
	public List<Goods> getSpecialGoods();
	
	public List<Goods> getNewGoods();
	
	public List<Goods> getLoveGoods();
	
	public int getPageNum(String typeName);
	
	public Goods getById(int id);
	
	public List<Goods> getBySeller(int goodsId);
	
}
