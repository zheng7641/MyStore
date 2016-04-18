package com.zheng.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	/*@RequestMapping("type")
	public void getByType(@RequestParam(value="typeName",required=false) String typeName,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("goodsList", goodsService.getByType(type, 16*(Integer.valueOf(page)-1), 16*Integer.valueOf(page)-1));
		System.out.println("11111");
		request.getRequestDispatcher("/goodlist.jsp").forward(request, response);
	}*/
	
	/**
	 * 首页广告
	 */
	@RequestMapping("specialGoods")
	public void getSpecialGoods(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("specialGoods", goodsService.getSpecialGoods());
		request.getRequestDispatcher("/goodlist.jsp").forward(request, response);
	}
	
	/**
	 * 详细商品
	 * @param goodId
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("getGood")
	public void getGood(@RequestParam(value="goodId",required=false) String goodId,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("good", null);
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}
}
