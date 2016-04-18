package com.zheng.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Goods;

public interface GoodsDao {

	
	/**
	 * �����Ʒ
	 * @param goodsName
	 * @param goodsDescription
	 * @param price
	 * @param quality
	 * @param tradingPosition
	 * @param contactInformation
	 * @param businessDeal
	 * @param timestamp
	 * @return
	 */
	public int add(@Param("goodsName")String goodsName,@Param("goodsDescription")String goodsDescription,@Param("price")int price,@Param("quality")String quality,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal,@Param("CreateTime")Date createTime,@Param("typeId")int typeId);
	
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
	 * ��ȡ��Ʒ ��ʱ������
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Goods> getNewGoods(@Param("first")int first,@Param("number")int number);
	
	public List<Goods> getGoodsImgMsg(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
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
	public List<Goods> getByType(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
	/**
	 * ͨ�����ͷ�ҳ��������
	 * @param typeName
	 * @param begin
	 * @param number
	 * @return
	 */
	public List<Goods> getSpecialGoods(@Param("typeName")String typeName,@Param("first")int first,@Param("number")int number);
	
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
