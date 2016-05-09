package com.zheng.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.zheng.entity.Goods;
import com.zheng.service.GoodsService;
import com.zheng.service.ImagesService;
import com.zheng.service.TypeService;
import com.zheng.service.UserService;
import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

@Controller
public class GoodsController {

	@Resource
	private TypeService typeService;
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private ImagesService imagesService;
	
	@Resource
	private UserService userService;
	
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
	
	/**
	 * 上传商品
	 * @param goodsName
	 * @param goodsType
	 * @param goodsPrice
	 * @param new_old
	 * @param contactInformation
	 * @param businessdeal
	 * @param place
	 * @param textfield3
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value="addgoods")
	public void addGoods(
			@RequestParam(value="goodsName",required=false)String goodsName,
			@RequestParam(value="goodsType",required=false)String goodsType,
			@RequestParam(value="goodsPrice",required=false)String goodsPrice,
			@RequestParam(value="new_old",required=false)String new_old,
			@RequestParam(value="contactInformation",required=false)String contactInformation,
			@RequestParam(value="businessdeal",required=false)String businessdeal,
			@RequestParam(value="place",required=false)String place,
			@RequestParam(value="textfield3",required=false)String textfield3,
			@RequestParam(value="userName",required=false)String userName,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		System.out.println(goodsName);
		System.out.println(goodsType);
		System.out.println(goodsPrice);
		System.out.println(new_old);
		System.out.println(contactInformation);
		System.out.println(place);
		System.out.println(textfield3);
		System.out.println(userName);
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createTime = formatter.format(currentTime);
		goodsService.add(goodsName, textfield3, Integer.valueOf(goodsPrice), new_old, place, contactInformation, businessdeal, createTime, typeService.getByName(goodsType).getTypeId(),userService.getUserId(userName));
		int goodsId = goodsService.getGoods(goodsName, Integer.valueOf(goodsPrice), place, contactInformation, businessdeal).get(0).getGoodsId();
		//----------------------------------图片上传部分---------------------------------
		//创建一个通用的多部分解析器  
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求  
        if(multipartResolver.isMultipart(request)){  
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();  
            System.out.println(iter);
            while(iter.hasNext()){  
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());  
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println("文件名："+myFileName);  
                        //重命名上传后的文件名  
                        String fileName = String.valueOf(UUID.randomUUID())+myFileName;  //文件名
                        //定义上传路径  
                        String path = "E:/JAVA/workspace2015-11-30/MyStore/src/main/webapp/goods/" + fileName;  
                        System.out.println("保存路径:"+path);
                        File localFile = new File(path);  
                        file.transferTo(localFile);  
                        //定义访问路径
                        String urlPath = "http://localhost:8080/MyStore/goods/"+fileName;
                        //保存图片路径
                        imagesService.setImages(urlPath,goodsId);
                    }  
                }  
            }  
              
        }  
		//----------------------------------图片上传部分---------------------------------
        request.getRequestDispatcher("/index.do").forward(request, response);
	}
	
	@RequestMapping("getGoodsList")
	public void getGoodsList(@RequestParam("page")String page,@RequestParam("rows")String rows,HttpServletResponse response) throws Exception{
		List<Goods> goodsList = goodsService.getList((Integer.valueOf(page)-1)*Integer.valueOf(rows), Integer.valueOf(rows));
		int count = goodsService.getCount();
		JsonConfig jsonConfig = new JsonConfig();
		JSONArray row = JSONArray.fromObject(goodsList, jsonConfig);
		JSONObject result = new JSONObject();
		result.put("rows", row);
		result.put("total", count);
		WriteUtil.write(response, result);
	}
	
	@RequestMapping("deleteGoods")
	public void deleteGoods(@RequestParam("ids")String ids,HttpServletResponse response) throws Exception{
		goodsService.delete(ids);
	}
}
