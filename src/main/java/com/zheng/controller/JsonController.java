package com.zheng.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;

@Component
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
	
}
