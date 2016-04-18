package com.zheng.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.service.GoodsService;
import com.zheng.service.NoticeService;

@Controller
public class IndexController {

	@Resource
	private NoticeService noticeService;

	@Resource
	private GoodsService goodsService;

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
	
	@RequestMapping("/good")
	public void getPage(@RequestParam(value="goodId",required=false)String id,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setAttribute("goods", goodsService.getById(Integer.valueOf(id)));
		request.setAttribute("otherGoodsList", goodsService.getBySeller(Integer.valueOf(id)));
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}
}
