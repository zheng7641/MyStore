package com.zheng.dao;

import java.util.List;

import com.zheng.entity.GoodsMessage;

public interface GoodsMessageDao {

	/**
	 * �����Ʒ����
	 * 
	 * @param goodsMessage
	 * @return int
	 */
	public int add(GoodsMessage goodsMessage);

	/**
	 * �ظ�����
	 * 
	 * @param id
	 * @return int
	 */
	public int reply(int id);

	/**
	 * ɾ����Ʒ����
	 * 
	 * @param id
	 * @return int
	 */
	public int delete(Integer id);

	/**
	 * ɾ�����û�����������
	 * 
	 * @param userName
	 * @return int
	 */
	public int deleteByUser(String userName);

	/**
	 * ɾ����Ʒ�µ���������
	 * 
	 * @param id
	 * @return int
	 */
	public int deleteByGoods(int id);

	/**
	 * ͨ��ID��ȡ����
	 * 
	 * @param id
	 * @return GoodsMessage
	 */
	public GoodsMessage getById(int id);

	/**
	 * ��ȡ��Ʒ����������
	 * 
	 * @param goodsId
	 * @return List<GoodsMessage>
	 */
	public List<GoodsMessage> getAll(int goodsId);

}
