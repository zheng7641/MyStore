package com.zheng.dao;

import java.util.List;

import com.zheng.entity.Type;

public interface TypeDao {

	/**
	 * �����Ʒ����
	 * @param type
	 * @return int
	 */
	public int add(Type type);

	
	/**
	 * ɾ������
	 * @param id
	 * @return int
	 */
	public int delete(Integer id);
	
	
	/**
	 * ɾ�����ͣ�ͨ��������
	 * @param name
	 * @return int
	 */
	public int deleteByName(String name);
	
	
	/**
	 * ����
	 * @param type
	 * @return int
	 */
	public int update(Type type);
	
	/**
	 * ��ȡȫ����Ʒ����
	 * @return
	 */
	public List<Type> getAll();
	
	
	/**
	 * ͨ��Id��ѯ
	 * @param id
	 * @return int
	 */
	public Type getById(int id);
	
	/**
	 * ͨ����������ѯ
	 * @param name
	 * @return Type
	 */
	public Type getByName(String name);
	
	/**
	 * ͨ��ID��ѯ�ֶ�
	 * @param id
	 * @return List<String>
	 */
	public List<String> getStringById(int id);

	/**
	 * ͨ���ֶβ�ѯ�ֶ�
	 * @param name
	 * @return list<String>
	 */
	public List<String> getStringByString(String name);

	/**
	 * ��ѯ��¼����
	 * @return
	 */
	public Long getTotal();
	
}










