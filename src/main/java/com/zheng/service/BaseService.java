package com.zheng.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public interface BaseService<T> {

	/**
	 * ���
	 * 
	 * @param user
	 * @return
	 */
	public void add(T t);

	/**
	 * ɾ��
	 * 
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * ɾ��
	 * 
	 * @param T
	 * @return
	 */
	public int delete(T t);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 * @return
	 */
	public int update(T t);

	/**
	 * ͨ��ID��ѯ
	 * 
	 * @param int
	 * @return
	 */
	public T getById(int id);
	
	/**
	 * ͨ��name��ѯ
	 * 
	 * @param int
	 * @return
	 */
	public T getByName(String name);

	/**
	 * ��ѯһ���ֶε�ֵ
	 * 
	 * @param int
	 * @return
	 */
	public List<String> getStringById(int id);
	
	/**
	 * ��ѯһ���ֶε�ֵ
	 * 
	 * @param String
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
	 * ��ѯ����
	 * 
	 * @param
	 * @return
	 */
	public List<T> getAll();

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal(T t);
}
