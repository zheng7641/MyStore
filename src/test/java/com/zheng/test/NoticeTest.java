package com.zheng.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.dao.NoticeDao;
import com.zheng.entity.Notice;

public class NoticeTest {

	NoticeDao noticeDao;
	@Before
	public void before() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" });
		noticeDao = (NoticeDao) context.getBean("noticeDao");
	}
	
	@Test
	public void getIndexNoticeTest(){
		List<Notice> noticeList = noticeDao.get(0, 5);
		for(Notice n:noticeList){
			System.out.println(n);
		}
	}
}
