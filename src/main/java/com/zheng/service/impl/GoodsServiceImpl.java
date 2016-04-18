package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.GoodsDao;
import com.zheng.dao.ImagesDao;
import com.zheng.entity.Goods;
import com.zheng.service.GoodsService;

@Component
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao goodsDao;
	
	@Resource
	private ImagesDao imagesDao;
	
	public List<Goods> getByType(String typeName,int first,int number){
		List<Goods> goodsList = goodsDao.getByType(typeName,first,number);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		System.out.println("--------------------------"+goodsList.size());
		return goodsList;
	}
	
	/**
	 * 特色市场
	 * 商品图片URL、商品标题
	 */
	public List<Goods> getSpecialGoods(){
		List<Goods> goodsList = goodsDao.getByType("篮球", 0, 14);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * 新品上架
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
	 * 猜你喜欢
	 */
	public List<Goods> getLoveGoods(){
		List<Goods> goodsList = goodsDao.getByType("篮球", 0, 10);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
	/**
	 * 今日最火
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
	 * 返回总页数
	 */
	public int getPageNum(String typeName){
		return goodsDao.getTotal(typeName)/16+1;
	}
	
	/**
	 * 获取商品
	 */
	public Goods getById(int id){
		Goods goods = goodsDao.getById(id);
		goods.setImagesList(imagesDao.getByGoodsId(id));
		return goods;
	}
	
	/**
	 * 获取用户其他商品
	 */
	public List<Goods> getBySeller(int goodsId){
		int userId = goodsDao.getUserId(goodsId);
		List<Goods> goodsList = goodsDao.getBySeller(userId);
		for(Goods g:goodsList){
			g.setImagesList(imagesDao.getByGoodsId(g.getGoodsId()));
		}
		return goodsList;
	}
	
}
