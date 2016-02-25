package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zheng.dao.UserMapper;
import com.zheng.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserMapper UserMapper;
	
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("11111");
		User user1 = UserMapper.getByUserName("zhangsan");
		System.out.println("22222");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("user1", user1);
		return mav;
	}
}
