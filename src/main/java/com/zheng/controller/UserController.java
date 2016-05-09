package com.zheng.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zheng.entity.User;
import com.zheng.service.UserService;
import com.zheng.util.WriteUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")

	public String login(HttpSession session, @RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		try {
			subject.login(token);
			session.setAttribute("userName", userName);
			return "redirect:/index.do";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@RequestMapping("/register")
	public String register(@RequestParam(value="userId",required=false) String userId, 
			@RequestParam("userName") String userName, 
			@RequestParam("password") String password,
			@RequestParam("nickName") String nickName, 
			@RequestParam("sex") String sex,
			@RequestParam("email") String email, 
			@RequestParam("phone") String phone,
			@RequestParam("location") String location) {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createTime = formatter.format(currentTime);
		if(userId == null){
			User user = new User(userName, password, nickName, sex, phone, location, createTime, email);
			userService.add(user);
		}else{
			User user = new User(Integer.valueOf(userId),userName, password, nickName, sex, phone, location, createTime, email);
			userService.update(user);
		}
		return null;
	}

	@RequestMapping("/List")
	public List<User> userList(HttpServletResponse response, String page, String rows) throws Exception {
		List<User> userList = userService.getAll(page, rows);
		int count = userService.getCount();

		JsonConfig jsonConfig = new JsonConfig();
		JSONArray row = JSONArray.fromObject(userList, jsonConfig);
		JSONObject result = new JSONObject();
		result.put("rows", row);
		result.put("total", count);
		WriteUtil.write(response, result);
		return null;
	}
	
	@RequestMapping("delete")
	public String deleteUser(@RequestParam("ids")String ids){
		userService.deleteById(ids);
		return "success";
	}
	
}