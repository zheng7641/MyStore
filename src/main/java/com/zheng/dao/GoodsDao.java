package com.zheng.dao;

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
	public int add(@Param("goodsName")String goodsName,@Param("goodsDescription")String goodsDescription,@Param("price")int price,@Param("quality")String quality,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal,@Param("CreateTime")String createTime,@Param("typeId")int typeId,@Param("userId")int userId);
	
	/**
	 * ɾ����Ʒ
	 * 
	 * @param goodsId
	 * @return
	 */
	public int delete(int goodsId);
	
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
	 * ͨ������id������Ʒ
	 * @param name
	 * @return List<Goods>
	 */
	public List<Goods> getBySeller(int userId);
	
	/**
	 * ��ҳͨ������id������Ʒ
	 * @param userId
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Goods> getByUserId2(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
	/**
	 * ͨ����Ʒid��������id
	 * @param goodsId
	 * @return
	 */
	public int getUserId(int goodsId);
	
	/**
	 * ��ȡ�û���������Ʒ����
	 * @param userId
	 * @return
	 */
	public int getPublishNum(int userId);
	
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
	 * ��ѯgoodsId
	 * @param goodsName
	 * @param price
	 * @param tradingPosition
	 * @param contactInformation
	 * @param businessDeal
	 * @return
	 */
	public List<Goods> getGoods(@Param("goodsName")String goodsName,@Param("price")int price,@Param("tradingPosition")String tradingPosition,@Param("contactInformation")String contactInformation,@Param("businessDeal")String businessDeal);
	
	/**
	 * ��ҳ��ѯ��Ʒ
	 * @param begin ��ʼ��ID��
	 * @param number ÿҳ��ʾ������
	 * @return list<Goods>
	 */
	public List<Goods> getList(@Param("first")int first,@Param("number")int number);
	
	/**
	 * ��ȡ�����Ʒ�б�
	 * @param number ��ʾ����
	 * @return list<Goods>
	 */
	public List<Goods> getHotList(int number);
	
	/**
	 * ��ȡ�û��Ĺ��ﳵ
	 * @param userId
	 * @return
	 */
	public List<Goods> getOrderList(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
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
	public int getTotal(String typeName);

	/**
	 * ��ȡ��Ʒ����
	 * @return
	 */
	public int getCount();
	
}
