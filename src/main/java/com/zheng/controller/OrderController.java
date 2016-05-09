package com.zheng.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.entity.OrderResultSet;
import com.zheng.service.OrderService;
import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

@Controller
@RequestMapping("order")
public class OrderController {

	@Resource
	OrderService orderService;
	
	@RequestMapping("getOrderList")
	public void getList(@RequestParam("page")String page,@RequestParam("rows")String rows,HttpServletResponse response) throws Exception{
		List<OrderResultSet> orderList = orderService.getList((Integer.valueOf(page)-1)*Integer.valueOf(rows), Integer.valueOf(rows));
		int count = orderService.getCount();
		
		JsonConfig jsonConfig = new JsonConfig();
		JSONArray row = JSONArray.fromObject(orderList, jsonConfig);
		JSONObject result = new JSONObject();
		result.put("rows", row);
		result.put("total", count);
		WriteUtil.write(response, result);
	}
}
