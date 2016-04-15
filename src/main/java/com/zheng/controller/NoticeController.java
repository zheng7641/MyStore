package com.zheng.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zheng.entity.Notice;
import com.zheng.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Resource
	NoticeService noticeService;
	
	@RequestMapping("/getNotice")
	public ModelAndView getNotice(){
		List<Notice> noticeList = noticeService.getIndexNotice();
		ModelAndView mav = new ModelAndView();
		mav.addObject("noticeList", noticeList);
		mav.setViewName("index");
		return mav;
	}
}
