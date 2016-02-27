package com.zheng.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	/*public T login(T user);*/

	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal(T t);

	/**
	 * 添加
	 * 
	 * @param user
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
	public int delete(T t);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	public int update(T t);

	/**
	 * 查询集合
	 * 
	 * @param map
	 * @return
	 */
	public List<T> find(Map<String, Object> map);

	/**
	 * 通过ID查询一个
	 * 
	 * @param int
	 * @return
	 */
	public List<T> findById(int id);
	/**
	 * 查询所有
	 * 
	 * @param 
	 * @return
	 */
	public List<T> findAll();
}
