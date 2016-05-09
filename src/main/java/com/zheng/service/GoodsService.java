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
	
	public int add(String goodsName,String goodsDescription,int price,String quality,String tradingPosition,String contactInformation,String businessDeal,String createTime,int typeId,int userId);
	
	public List<Goods> getGoods(String goodsName,int price,String tradingPosition,String contactInformation,String businessDeal);
	
	public List<Goods> getByUserId(int userId);
	
	public int deleteGoods(int goodsId);
	
	public int getPublishNum(int userId);
	
	public List<Goods> getByUserId2(int userId,int first,int number);
	
	public List<Goods> getOrderList(int userId,int first,int number);
	
	public List<Goods> getList(int first,int number);

	public int getCount();
	
	public void delete(String ids);
}
