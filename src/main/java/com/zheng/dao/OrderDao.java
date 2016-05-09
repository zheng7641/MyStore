package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Goods;
import com.zheng.entity.OrderResultSet;

public interface OrderDao {

	/**
	 * 增加购物车
	 * @return
	 */
	public int add();
	
	/**
	 * 获取用户的购物车
	 * @param userId
	 * @return
	 */
	public List<Goods> getOrderList(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
	/**
	 * 分页获取购物车数据
	 * @param first
	 * @param number
	 * @return
	 */
	public List<OrderResultSet> getList(@Param("first")int first,@Param("number")int number);
	
	/**
	 * 删除购物车
	 * @param goodsId
	 * @return
	 */
	public int deleteByGoodsId(int goodsId);
	
	/**
	 * 删除购物车内商品
	 * @param userId
	 * @param goodsId
	 * @return
	 */
	public int delete(@Param("userId")int userId,@Param("goodsId")int goodsId);
	
	/**
	 * 获取用户购物车总数
	 * @param userId
	 * @return
	 */
	public int getSumOrder(int userId);
	
	/**
	 * 删除该用户所有购物车商品
	 * @param userId
	 * @return
	 */
	public int deleteAll(int userId);

	/**
	 * 获取订单总数
	 * @return
	 */
	public int getCount();
}
