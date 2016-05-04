package com.zheng.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.GoodsDao;
import com.zheng.dao.GoodsMessageDao;
import com.zheng.dao.ImagesDao;
import com.zheng.dao.OrderDao;
import com.zheng.entity.Goods;
import com.zheng.service.GoodsService;

@Component
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao goodsDao;
	
	@Resource
	private ImagesDao imagesDao;
	
	@Resource
	private OrderDao orderDao;
	
	@Resource
	private GoodsMessageDao goodsMessageDao;
	
	public List<Goods> getByType(String typeName,int first,int number){
		List<Goods> goodsList = goodsDao.getByType(typeName,first,number);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		System.out.println("--------------------------"+goodsList.size());
		return goodsList;
	}
	
	/**
	 * ��ɫ�г�
	 * ��ƷͼƬURL����Ʒ����
	 */
	public List<Goods> getSpecialGoods(){
		List<Goods> goodsList = goodsDao.getByType("����", 0, 14);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * ��Ʒ�ϼ�
	 * @return
	 */
	public List<Goods> getNewGoods(){
		List<Goods> goodsList = goodsDao.getNewGoods(0, 5);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * ����ϲ��
	 */
	public List<Goods> getLoveGoods(){
		List<Goods> goodsList = goodsDao.getByType("����", 0, 10);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * �������
	 * @return
	 */
	public List<Goods> getHotGoods(){
		List<Goods> goodsList = goodsDao.getNewGoods(0, 4);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * ������ҳ��
	 */
	public int getPageNum(String typeName){
		return goodsDao.getTotal(typeName)/16+1;
	}
	
	/**
	 * ��ȡ��Ʒ
	 */
	public Goods getById(int id){
		Goods goods = goodsDao.getById(id);
		goods.setImagesList(imagesDao.getByGoodsId(id));
		return goods;
	}
	
	/**
	 * ��ȡ�û�������Ʒ
	 */
	public List<Goods> getBySeller(int goodsId){
		int userId = goodsDao.getUserId(goodsId);
		List<Goods> goodsList = goodsDao.getBySeller(userId);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * ��ȡ����û�������ȫ����Ʒ
	 * @param userId
	 * @return
	 */
	public List<Goods> getByUserId(int userId){
		List<Goods> goodsList = goodsDao.getBySeller(userId);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * ��ҳ��ȡ����û�������ȫ����Ʒ
	 * @param userId
	 * @return
	 */
	public List<Goods> getByUserId2(int userId,int first,int number){
		List<Goods> goodsList = goodsDao.getByUserId2(userId, first, number);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * �����Ʒ
	 */
	public int add(String goodsName,String goodsDescription,int price,String quality,String tradingPosition,String contactInformation,String businessDeal,Date createTime,int typeId,int userId){
		return goodsDao.add(goodsName, goodsDescription, price, quality, tradingPosition, contactInformation, businessDeal, createTime, typeId, userId);
	}

	public List<Goods> getGoods(String goodsName, int price, String tradingPosition, String contactInformation,
			String businessDeal) {
		return goodsDao.getGoods(goodsName, price, tradingPosition, contactInformation, businessDeal);
	}

	/**
	 * ɾ����Ʒ
	 */
	public int deleteGoods(int goodsId) {
		imagesDao.deleteImages(goodsId);//ɾ��ͼƬ
		orderDao.deleteByGoodsId(goodsId);//ɾ�����ﳵ��Ʒ
		goodsMessageDao.delete(goodsId);
		goodsDao.delete(goodsId);//ɾ��Ʒ
		return 0;
	}

	/**
	 * ��ȡ�û���������Ʒ����
	 */
	public int getPublishNum(int userId) {
		return goodsDao.getPublishNum(userId);
	}
	
	/**
	 * ��ȡ�û����ﳵ��Ʒ
	 * @param userId
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Goods> getOrderList(int userId,int first,int number){
		List<Goods> orderList = goodsDao.getOrderList(userId, first, number);
		for(Goods g:orderList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return orderList;
	}

	
}
