package com.zheng.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface BaseDao<T> {

	/**
	 * 添加
	 * 
	 * @param T
	 * @return
	 */
	public int add(T t);

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
	 * @param T
	 * @return
	 */
	public int update(T t);

	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	public T getById(int id);

	/**
	 * 通过名字查询
	 * 
	 * @param Name
	 * @return
	 */
	public T getByName(String name);

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
	 * 查询集合
	 * 
	 * @param map
	 * @return
	 */
	public List<T> get(Map<String, Object> map);

	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal();
}
