package com.zheng.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.entity.Notice;
import com.zheng.service.NoticeService;
import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;

@Controller
public class NoticeController {
	
	@Resource
	private NoticeService noticeService;
	
	@RequestMapping("getNotice")
	public void getNotice(HttpServletResponse response) throws Exception{
		List<Notice> noticeList = noticeService.getIndexNotice();
		JSONArray jsonArray = JSONArray.fromObject(noticeList);
		WriteUtil.write(response, jsonArray);
		System.out.println("已发送通知");
	}
	
	@RequestMapping("notice")
	public void getNoticeById(@RequestParam(value="noticeId",required=false) String noticeId,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("notice", noticeService.getOneNotice(Integer.valueOf(noticeId)));
		request.getRequestDispatcher("/notice.jsp").forward(request, response);
	}
}
