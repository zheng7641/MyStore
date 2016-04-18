package com.zheng.service.impl;

import javax.annotation.Resource;

import com.zheng.dao.NoticeDao;
import com.zheng.service.PageService;

public class PageServiceImpl implements PageService{

	@Resource
	private NoticeDao noticeDao;
	
}
