package com.zheng.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("JsonController")
public class JsonController {

	@RequestMapping("get")
	public String getJson(@RequestParam(value="name",required=false) Object o,@RequestParam(value="password",required=false) Object o1,HttpServletResponse response){
		JSONArray j = new JSONArray();
		
		System.out.println("接收的json为:"+o+"-"+o1);
		
		HashMap<String, String> m = new HashMap<String,String>();
		m.put("a", "a");m.put("b", "b");
		j.add(m);
		try {
			WriteUtil.write(response,j.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("test")
	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("a", "aaa");
		
		Map<String,Object> map1 = new HashMap<String,Object>();
		map.put("b", map1);
		request.setAttribute("map", map);
		request.getRequestDispatcher("/test.jsp").forward(request, response);
	}
	
	@RequestMapping("test1")
	public void test1(@RequestParam(value="title",required=false) String title,HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(title);
		System.out.println(request.getParameter("title"));
	}
	
}
