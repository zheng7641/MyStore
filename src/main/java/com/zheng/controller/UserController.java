package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zheng.dao.UserDao;
import com.zheng.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao UserMapper;

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		System.out.println("login " + userName + " " + password);
		User user1 = UserMapper.getByUserName("zhangsan");
		System.out.println("22222");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("user1", user1);
		return mav;
	}
}
