package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.GoodsDao;
import com.zheng.dao.GoodsMessageDao;
import com.zheng.dao.ImagesDao;
import com.zheng.dao.OrderDao;
import com.zheng.dao.TypeDao;
import com.zheng.entity.Goods;
import com.zheng.entity.Images;
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
	
	@Resource
	private TypeDao typeDao;
	
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
	 * 获取商品总数
	 * @return
	 */
	public int getCount(){
		return goodsDao.getCount();
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
	
	/**
	 * 获取这个用户发布的全部商品
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
	 * 分页获取这个用户发布的全部商品
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
	 * 添加商品
	 */
	public int add(String goodsName,String goodsDescription,int price,String quality,String tradingPosition,String contactInformation,String businessDeal,String createTime,int typeId,int userId){
		return goodsDao.add(goodsName, goodsDescription, price, quality, tradingPosition, contactInformation, businessDeal, createTime, typeId, userId);
	}

	public List<Goods> getGoods(String goodsName, int price, String tradingPosition, String contactInformation,
			String businessDeal) {
		return goodsDao.getGoods(goodsName, price, tradingPosition, contactInformation, businessDeal);
	}

	/**
	 * 删除商品
	 */
	public int deleteGoods(int goodsId) {
		imagesDao.deleteImages(goodsId);//删除图片
		orderDao.deleteByGoodsId(goodsId);//删除购物车商品
		goodsMessageDao.delete(goodsId);//删评论
		goodsDao.delete(goodsId);//删商品
		return 0;
	}

	/**
	 * 获取用户发布的商品总数
	 */
	public int getPublishNum(int userId) {
		return goodsDao.getPublishNum(userId);
	}
	
	/**
	 * 获取用户购物车商品
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

	
	/**
	 * 分页获取商品列表
	 */
	public List<Goods> getList(int first,int number){
		List<Goods> goodsList = goodsDao.getList(first, number);
		for(Goods g:goodsList){
			/*String url = imagesDao.getByGoodsId(g.getGoodsId()).get(0).getImagesUrl().substring(30);
			g.setImageUrl(url);
			System.out.println(url);*/
			String url;
			List<Images> imagesList = imagesDao.getByGoodsId(g.getGoodsId());
			if(imagesList.isEmpty()){
				url = "";
			}else{
				url = imagesList.get(0).getImagesUrl();
			}
			g.setImageUrl(url);
			g.setTypeName(typeDao.getTypeName(Integer.valueOf(g.getTypeId())));
		}
		
		return goodsList;
	}

	public void delete(String ids) {
		String[] goodsIds = ids.split(",");
		for(String goodsId:goodsIds){
			imagesDao.deleteImages(Integer.valueOf(goodsId));
			goodsDao.delete(Integer.valueOf(goodsId));
		}
	}
}
