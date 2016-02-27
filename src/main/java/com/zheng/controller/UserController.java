package com.zheng.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zheng.entity.User;
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
			return "index.jsp";
		}catch(Exception e){
			e.printStackTrace();
			return "error.jsp";
		}
	}
}
