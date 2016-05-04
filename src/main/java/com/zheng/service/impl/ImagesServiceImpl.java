package com.zheng.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.ImagesDao;
import com.zheng.service.ImagesService;
@Component
public class ImagesServiceImpl implements ImagesService{

	@Resource
	private ImagesDao imagesDao;
	
	/**
	 * Ôö¼ÓÍ¼Æ¬
	 */
	public int setImages(String imagesUrl, int goodsId) {
		return imagesDao.setImages(imagesUrl, goodsId);
	}
	
}
