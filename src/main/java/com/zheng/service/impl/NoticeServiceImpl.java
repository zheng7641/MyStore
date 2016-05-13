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
	 * 返回首页显示的6个通知
	 */
	public List<Notice> getIndexNotice() {
		return noticeDao.get(0,6);
	}

	public Notice getOneNotice(int noticeId) {
		return noticeDao.getOneNotice(noticeId);
	}

	public List<Notice> getNoticeList(int first, int number) {
		return noticeDao.get(first, number);
	}

	public int getCount() {
		return noticeDao.getCount();
	}

	public void add(Notice notice) {
		noticeDao.add(notice);
	}

	
	
}
