package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.NoticeDao;
import com.zheng.entity.Notice;
import com.zheng.service.NoticeService;

@Component
public class NoticeServiceImpl implements NoticeService{

	@Resource
	private NoticeDao noticeDao;
	
	/**
	 * ������ҳ��ʾ��6��֪ͨ
	 */
	public List<Notice> getIndexNotice() {
		List<Notice> noticeList = noticeDao.get(0,6);
		return noticeList;
	}

	public Notice getOneNotice(int id) {
		
		return null;
	}

	
}
