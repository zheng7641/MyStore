package com.zheng.dao;

import java.util.List;

import com.zheng.entity.Goods;
import com.zheng.entity.Type;

public interface GoodsDao {

	/**
	 * 添加商品
	 * 
	 * @param goods
	 * @return int
	 */
	public int add(Goods goods);
	
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
	public List<Goods> getByType(Type type);
	
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
