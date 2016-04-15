package com.zheng.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserServiceImpl userServiceImpl;
	
	

	@RequestMapping("/login")
	
	public String login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		try{
			subject.login(token);
			return "redirect:/notice/getNotice.do";
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	
	@RequestMapping("/register")
	public String register(@RequestParam("userName") String userName,@RequestParam("password")String password,@RequestParam("password2") String password2,@RequestParam("eMail") String eMail) {
		//userServiceImpl.add(new User("userName","password"));
		return "redircet:/index";
	}

}