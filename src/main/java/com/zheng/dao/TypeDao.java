package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Type;

public interface TypeDao {

	/**
	 * 添加商品类型
	 * @param type
	 * @return int
	 */
	public int add(Type type);

	
	/**
	 * 删除类型
	 * @param id
	 * @return int
	 */
	public int delete(Integer id);
	
	
	/**
	 * 删除类型，通过类型名
	 * @param name
	 * @return int
	 */
	public int deleteByName(String name);
	
	
	/**
	 * 更新
	 * @param type
	 * @return int
	 */
	public int update(Type type);
	
	/**
	 * 获取全部商品类型
	 * @return
	 */
	public List<Type> getAll();
	
	/**
	 * 获取所有子类型
	 * @param level
	 * @param fatherTypeId
	 * @return
	 */
	public List<Type> getTypeTree(@Param("fatherTypeId")String fatherTypeId);
	
	
	public List<Type> getByLevel(int level);
	/**
	 * 通过Id查询
	 * @param id
	 * @return int
	 */
	public Type getById(int id);
	
	/**
	 * 通过类型名查询
	 * @param name
	 * @return Type
	 */
	public Type getByName(String name);
	
	/**
	 * 通过ID查询字段
	 * @param id
	 * @return List<String>
	 */
	public List<String> getStringById(int id);

	/**
	 * 通过字段查询字段
	 * @param name
	 * @return list<String>
	 */
	public List<String> getStringByString(String name);

	/**
	 * 查询记录总数
	 * @return
	 */
	public Long getTotal();
	
}










