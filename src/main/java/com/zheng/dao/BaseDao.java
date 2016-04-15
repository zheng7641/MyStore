package com.zheng.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface BaseDao<T> {

	/**
	 * ���
	 * 
	 * @param T
	 * @return
	 */
	public int add(T t);

	/**
	 * ɾ��
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * ɾ����ͨ���ֶ�
	 * @param name
	 * @return int
	 */
	public int deleteByName(String name);
	
	/**
	 * �޸�
	 * 
	 * @param T
	 * @return
	 */
	public int update(T t);

	/**
	 * ͨ��ID��ѯ
	 * 
	 * @param id
	 * @return
	 */
	public T getById(int id);

	/**
	 * ͨ�����ֲ�ѯ
	 * 
	 * @param Name
	 * @return
	 */
	public T getByName(String name);

	/**
	 * ͨ��ID��ѯ�ֶ�
	 * 
	 * @param Name
	 * @return
	 */
	public List<String> getStringById(int id);
	
	/**
	 * ͨ���ֶβ�ѯ�ֶ�
	 * 
	 * @param Name
	 * @return
	 */
	public List<String> getStringByString(String name);
	
	/**
	 * ��ѯ����
	 * 
	 * @param map
	 * @return
	 */
	public List<T> get(Map<String, Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal();
}
