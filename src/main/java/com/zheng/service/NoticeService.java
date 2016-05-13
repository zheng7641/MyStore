package com.zheng.service;

import java.util.List;

import com.zheng.entity.Notice;

public interface NoticeService {

	public List<Notice> getIndexNotice();
	
	public Notice getOneNotice(int noticeId);
	
	public List<Notice> getNoticeList(int first,int number);
	
	public int getCount();
	
	public void add(Notice notice);
}
