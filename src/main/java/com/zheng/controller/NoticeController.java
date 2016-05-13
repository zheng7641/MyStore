package com.zheng.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

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
	
	@RequestMapping("getNoticeList")
	public void getNoticeList(@RequestParam("page")String page,@RequestParam("rows")String rows,HttpServletResponse response) throws Exception{
		List<Notice> noticeList = noticeService.getNoticeList((Integer.valueOf(page)-1)*Integer.valueOf(rows), Integer.valueOf(rows));
		int count = noticeService.getCount();
		
		JsonConfig jsonConfig = new JsonConfig();
		JSONArray row = JSONArray.fromObject(noticeList, jsonConfig);
		JSONObject result = new JSONObject();
		result.put("rows", row);
		result.put("total", count);
		WriteUtil.write(response, result);
	}
	
	@RequestMapping("addNotice")
	public String addNotice(@RequestParam("noticeTitle")String noticeTitle,@RequestParam("content")String content,HttpServletResponse response) throws Exception{
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createTime = formatter.format(currentTime);
		
		Notice notice = new Notice();
		notice.setNoticeTitle(noticeTitle);
		notice.setContent(content);
		notice.setCreateTime(createTime);
		JSONObject result = new JSONObject();
		try{
			noticeService.add(notice);
			result.put("success", "true");
			}
		catch(Exception e){
			result.put("success", "false");
		}
		finally{
			WriteUtil.write(response, result);
		}
		return null;
	}
}
