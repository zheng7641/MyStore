package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Goods;
import com.zheng.entity.OrderResultSet;

public interface OrderDao {

	/**
	 * ���ӹ��ﳵ
	 * @return
	 */
	public int add();
	
	/**
	 * ��ȡ�û��Ĺ��ﳵ
	 * @param userId
	 * @return
	 */
	public List<Goods> getOrderList(@Param("userId")int userId,@Param("first")int first,@Param("number")int number);
	
	/**
	 * ��ҳ��ȡ���ﳵ����
	 * @param first
	 * @param number
	 * @return
	 */
	public List<OrderResultSet> getList(@Param("first")int first,@Param("number")int number);
	
	/**
	 * ɾ�����ﳵ
	 * @param goodsId
	 * @return
	 */
	public int deleteByGoodsId(int goodsId);
	
	/**
	 * ɾ�����ﳵ����Ʒ
	 * @param userId
	 * @param goodsId
	 * @return
	 */
	public int delete(@Param("userId")int userId,@Param("goodsId")int goodsId);
	
	/**
	 * ��ȡ�û����ﳵ����
	 * @param userId
	 * @return
	 */
	public int getSumOrder(int userId);
	
	/**
	 * ɾ�����û����й��ﳵ��Ʒ
	 * @param userId
	 * @return
	 */
	public int deleteAll(int userId);

	/**
	 * ��ȡ��������
	 * @return
	 */
	public int getCount();
}
