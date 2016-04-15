package com.zheng.dao;

import java.util.List;

import com.zheng.entity.Goods;
import com.zheng.entity.Type;

public interface GoodsDao {

	/**
	 * �����Ʒ
	 * 
	 * @param goods
	 * @return int
	 */
	public int add(Goods goods);
	
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
	 * @param goods
	 * @return
	 */
	public int update(Goods goods);
	
	/**
	 * ͨ��ID��ѯ
	 * 
	 * @param id
	 * @return goods
	 */
	public Goods getById(int id);
	
	/**
	 * ͨ�����ֲ�ѯ
	 * 
	 * @param Name
	 * @return goods
	 */
	public List<Goods> getByName(String name);
	
	/**
	 * ͨ����������������Ʒ
	 * @param name
	 * @return List<Goods>
	 */
	public List<Goods> getBySeller(String name);
	
	/**
	 * ͨ����Ʒ���Ͳ�����Ʒ
	 * @param type
	 * @return
	 */
	public List<Goods> getByType(Type type);
	
	/**
	 * ��ҳ��ѯ��Ʒ
	 * @param begin ��ʼ��ID��
	 * @param number ÿҳ��ʾ������
	 * @return list<Goods>
	 */
	public List<Goods> getList(int begin,int number);
	
	/**
	 * ��ȡ�����Ʒ�б�
	 * @param number ��ʾ����
	 * @return list<Goods>
	 */
	public List<Goods> getHotList(int number);
	
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
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	public Long getTotal();
}
