package com.zheng.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.service.GoodsService;
import com.zheng.service.NoticeService;
import com.zheng.service.OrderService;

@Controller
public class IndexController {

	@Resource
	private NoticeService noticeService;

	@Resource
	private GoodsService goodsService;

	@Resource
	private OrderService orderService;
	
	@RequestMapping("/index")
	public void getIndex(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("noticeList", noticeService.getIndexNotice());// 通知
		request.setAttribute("specialGoods", goodsService.getSpecialGoods());// 广告
		request.setAttribute("newGoods", goodsService.getNewGoods());// 新品上架
		request.setAttribute("loveGoods", goodsService.getLoveGoods());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	@RequestMapping("/list")
	public void getList(@RequestParam(value="type",required=false)String type,@RequestParam(value="page",required=false)String page,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setAttribute("hotList", goodsService.getHotGoods());
		if(page==null||page.equals("")||Integer.valueOf(page)<1){
			page = "1";
		}
		request.setAttribute("type", type);//商品类型
		request.setAttribute("page", page);//当前页
		request.setAttribute("pageNum", goodsService.getPageNum(type));//总页数
		request.setAttribute("goodsList", goodsService.getByType(type, 16*(Integer.valueOf(page)-1), 16));
		request.getRequestDispatcher("/goodlist.jsp").forward(request, response);
	}
	
	@RequestMapping("/search")
	public void getSearchList(@RequestParam(value="search",required=false)String search,@RequestParam(value="page",required=false)String page,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setAttribute("hotList", goodsService.getHotGoods());
		if(page==null||page.equals("")||Integer.valueOf(page)<1){
			page = "1";
		}
		request.setAttribute("search", search);//商品类型
		request.setAttribute("page", page);//当前页
		request.setAttribute("pageNum", goodsService.getSearchNum(search));//总页数
		request.setAttribute("goodsList", goodsService.getSearchList(search, 16*(Integer.valueOf(page)-1), 16));
		request.getRequestDispatcher("/searchlist.jsp").forward(request, response);
	}
	
	@RequestMapping("/good")
	public void getPage(@RequestParam(value="goodId",required=false)String goodId,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setAttribute("goodId", goodId);
		request.setAttribute("goods", goodsService.getById(Integer.valueOf(goodId)));
		request.setAttribute("otherGoodsList", goodsService.getBySeller(Integer.valueOf(goodId)));
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}
	
	@RequestMapping("/usermanager")
	public void getUsermanager(@RequestParam(value="userId",required=false)String userId,@RequestParam(value="page",required=false)String page,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		if(page==null||Integer.valueOf(page)<1||page.equals("")){
			page = "1";
		}
		request.setAttribute("goodsList", goodsService.getByUserId2(Integer.valueOf(userId),5*(Integer.valueOf(page)-1),5));
		session.setAttribute("userId", userId);
		request.setAttribute("page", page);
		request.setAttribute("allPage", goodsService.getPublishNum(Integer.valueOf(userId))/5+1);
		request.getRequestDispatcher("/usermanager.jsp").forward(request, response);
	}
	
	@RequestMapping("/umdelete")
	public void deleteGoods(@RequestParam(value="goodsId",required=false)String goodsId,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		goodsService.deleteGoods(Integer.valueOf(goodsId));
		response.sendRedirect("/MyStore/usermanager.do?userId="+session.getAttribute("userId"));
		//request.getRequestDispatcher("/usermanager.do?userId="+session.getAttribute("userId")).forward(request, response);
	}
	
	@RequestMapping("/shoopingCart")
	public void getShoopingCart(@RequestParam(value="userId",required=false)String userId,@RequestParam(value="page",required=false)String page,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		if(page==null||Integer.valueOf(page)<1||page.equals("")){
			page = "1";
		}
		request.setAttribute("goodsList",goodsService.getOrderList(Integer.valueOf(userId), 5*(Integer.valueOf(page)-1),5));
		request.setAttribute("allPage", orderService.getSumOrder(Integer.valueOf(userId))/5+1);
		request.setAttribute("page", page);
		session.setAttribute("userId", userId);
		request.getRequestDispatcher("/shoopingCart.jsp").forward(request, response);
	}
	
	@RequestMapping("/scDelete")
	public void deleteShoopingCart(@RequestParam(value="userId",required=false)String userId,@RequestParam(value="goodsId",required=false)String goodsId,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		orderService.delete(Integer.valueOf(userId), Integer.valueOf(goodsId));
		response.sendRedirect("/MyStore/shoopingCart.do?userId="+session.getAttribute("userId"));
	}
}
