package com.zheng.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	/**
	 * �û���¼
	 * 
	 * @param user
	 * @return
	 */
	/*public T login(T user);*/

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal(T t);

	/**
	 * ���
	 * 
	 * @param user
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
	public int delete(T t);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 * @return
	 */
	public int update(T t);

	/**
	 * ��ѯ����
	 * 
	 * @param map
	 * @return
	 */
	public List<T> find(Map<String, Object> map);

	/**
	 * ͨ��ID��ѯһ��
	 * 
	 * @param int
	 * @return
	 */
	public List<T> findById(int id);
	/**
	 * ��ѯ����
	 * 
	 * @param 
	 * @return
	 */
	public List<T> findAll();
}
