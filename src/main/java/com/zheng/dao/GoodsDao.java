package com.zheng.dao;

import java.util.Date;
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
	public int add(@Param("goodsName")String goodsName,@Param("goodsDescription")String goodsDescription,@Param("price")int price,@Param("quality")String quality,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal,@Param("CreateTime")Date createTime,@Param("typeId")int typeId);
	
	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
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
	 * 通过卖家姓名查找商品
	 * @param name
	 * @return List<Goods>
	 */
	public List<Goods> getBySeller(String name);
	
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
	 * 分页查询商品
	 * @param begin 开始的ID号
	 * @param number 每页显示的数量
	 * @return list<Goods>
	 */
	public List<Goods> getList(int begin,int number);
	
	/**
	 * 获取最火商品列表
	 * @param number 显示数量
	 * @return list<Goods>
	 */
	public List<Goods> getHotList(int number);
	
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
	public Long getTotal();
}
