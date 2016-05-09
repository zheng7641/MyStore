package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Goods;

public interface GoodsDao {

	
	/**
	 * 添加商品
	 * @param goodsName
	 * @param goodsDescription
	 * @param price
	 * @param quality
	 * @param tradingPosition
	 * @param contactInformation
	 * @param businessDeal
	 * @param timestamp
	 * @return
	 */
	public int add(@Param("goodsName")String goodsName,@Param("goodsDescription")String goodsDescription,@Param("price")int price,@Param("quality")String quality,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal,@Param("CreateTime")String createTime,@Param("typeId")int typeId,@Param("userId")int userId);
	
	/**
	 * 删除商品
	 * 
	 * @param goodsId
	 * @return
	 */
	public int delete(int goodsId);
	
	/**
	 * 删除，通过字段
	 * @param name
	 * @return int
	 */
	public int deleteByName(String name);
	
	/**
	 * 修改
	 * 
	 * @param goods
	 * @return
	 */
	public int update(Goods goods);
	
	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return goods
	 */
	public Goods getById(int id);
	
	/**
	 * 获取新品 按时间排序
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Goods> getNewGoods(@Param("first")int first,@Param("number")int number);
	
	public List<Goods> getGoodsImgMsg(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 通过名字查询
	 * 
	 * @param Name
	 * @return goods
	 */
	public List<Goods> getByName(String name);
	
	/**
	 * 通过卖家id查找商品
	 * @param name
	 * @return List<Goods>
	 */
	public List<Goods> getBySeller(int userId);
	
	/**
	 * 分页通过卖家id查找商品
	 * @param userId
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Goods> getByUserId2(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 通过商品id查找卖家id
	 * @param goodsId
	 * @return
	 */
	public int getUserId(int goodsId);
	
	/**
	 * 获取用户发布的商品总数
	 * @param userId
	 * @return
	 */
	public int getPublishNum(int userId);
	
	/**
	 * 通过商品类型查找商品
	 * @param type
	 * @return
	 */
	public List<Goods> getByType(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 通过类型分页查找数据
	 * @param typeName
	 * @param begin
	 * @param number
	 * @return
	 */
	public List<Goods> getSpecialGoods(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 查询goodsId
	 * @param goodsName
	 * @param price
	 * @param tradingPosition
	 * @param contactInformation
	 * @param businessDeal
	 * @return
	 */
	public List<Goods> getGoods(@Param("goodsName")String goodsName,@Param("price")int price,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal);
	
	/**
	 * 分页查询商品
	 * @param begin 开始的ID号
	 * @param number 每页显示的数量
	 * @return list<Goods>
	 */
	public List<Goods> getList(@Param("first")int first,@Param("number")int number);
	
	/**
	 * 获取最火商品列表
	 * @param number 显示数量
	 * @return list<Goods>
	 */
	public List<Goods> getHotList(int number);
	
	/**
	 * 获取用户的购物车
	 * @param userId
	 * @return
	 */
	public List<Goods> getOrderList(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 通过ID查询字段
	 * 
	 * @param Name
	 * @return
	 */
	public List<String> getStringById(int id);
	
	/**
	 * 通过字段查询字段
	 * 
	 * @param Name
	 * @return
	 */
	public List<String> getStringByString(String name);
	
	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */
	public int getTotal(String typeName);

	/**
	 * 获取商品总数
	 * @return
	 */
	public int getCount();
	
}
