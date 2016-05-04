package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Images;

public interface ImagesDao {

	public List<Images> getByGoodsId(int goodsId);
	
	public int setImages(@Param("imagesUrl")String imagesUrl,@Param("goodsId")int goodsId);
	
	public int deleteImages(int goodsId);
}
