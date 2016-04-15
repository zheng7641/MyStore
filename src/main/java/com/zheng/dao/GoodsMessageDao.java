package com.zheng.dao;

import java.util.List;

import com.zheng.entity.GoodsMessage;

public interface GoodsMessageDao {

	/**
	 * 添加商品评论
	 * 
	 * @param goodsMessage
	 * @return int
	 */
	public int add(GoodsMessage goodsMessage);

	/**
	 * 回复评论
	 * 
	 * @param id
	 * @return int
	 */
	public int reply(int id);

	/**
	 * 删除商品评论
	 * 
	 * @param id
	 * @return int
	 */
	public int delete(Integer id);

	/**
	 * 删除该用户的所有评论
	 * 
	 * @param userName
	 * @return int
	 */
	public int deleteByUser(String userName);

	/**
	 * 删除商品下的所有评论
	 * 
	 * @param id
	 * @return int
	 */
	public int deleteByGoods(int id);

	/**
	 * 通过ID获取评论
	 * 
	 * @param id
	 * @return GoodsMessage
	 */
	public GoodsMessage getById(int id);

	/**
	 * 获取商品的所有评论
	 * 
	 * @param goodsId
	 * @return List<GoodsMessage>
	 */
	public List<GoodsMessage> getAll(int goodsId);

}
