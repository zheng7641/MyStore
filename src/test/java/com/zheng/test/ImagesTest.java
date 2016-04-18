package com.zheng.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.dao.ImagesDao;
import com.zheng.entity.Goods;
import com.zheng.entity.Images;

public class ImagesTest {
	private ImagesDao imagesDao;

	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		imagesDao = (ImagesDao) context.getBean("imagesDao");
	}

	@Test
	public void getByType() {
		List<Images> imagesList = imagesDao.getByGoodsId(1);
		System.out.println(imagesList);
	}

	@Test
	public void setImages() {
		for (int i = 15; i < 55; i++) {
			imagesDao.setImages("http://localhost:8080/MyStore/goods/lanqiu" + i + ".jpg", i);
		}
	}
}
