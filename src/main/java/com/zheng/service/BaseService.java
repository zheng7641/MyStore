package com.zheng.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public interface BaseService<T> {

	/**
	 * 添加
	 * 
	 * @param user
	 * @return
	 */
	public void add(T t);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * 删除
	 * 
	 * @param T
	 * @return
	 */
	public int delete(T t);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	public int update(T t);

	/**
	 * 通过ID查询
	 * 
	 * @param int
	 * @return
	 */
	public T getById(int id);
	
	/**
	 * 通过name查询
	 * 
	 * @param int
	 * @return
	 */
	public T getByName(String name);

	/**
	 * 查询一个字段的值
	 * 
	 * @param int
	 * @return
	 */
	public List<String> getStringById(int id);
	
	/**
	 * 查询一个字段的值
	 * 
	 * @param String
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
	 * 查询所有
	 * 
	 * @param
	 * @return
	 */
	public List<T> getAll();

	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal(T t);
}
