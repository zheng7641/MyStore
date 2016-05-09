package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.RoleDao;
import com.zheng.dao.UserDao;
import com.zheng.entity.Goods;
import com.zheng.entity.User;
import com.zheng.service.GoodsService;
import com.zheng.service.OrderService;
import com.zheng.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	private static final int ADMIN = 1;
	private static final int HUIYUAN = 2;
	
	@Resource
	private UserDao userDao;
	
	@Resource
	private RoleDao roleDao;
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private OrderService orderSerivce;
	
	public void add(User user) {
		userDao.add(user);
		//int userId = userDao.getId(user.getUserName());
		//roleDao.addRole(userId, HUIYUAN);
	}

	public int getUserId(String userName){
		return userDao.getId(userName);
	}

	public List<User> getAll(String page,String number) {
		return userDao.getAll((Integer.valueOf(page)-1)*Integer.valueOf(number),Integer.valueOf(number));
	}

	public User getUserAndRoleByUserName(String userName) {
		return userDao.getUserAndRole(userName);
	}

	public int getCount() {
		return userDao.getCount();
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void deleteById(String ids) {
		String[] userIds = ids.split(",");
		for(String userId:userIds){
			orderSerivce.deleteAll(Integer.valueOf(userId));
			List<Goods> goodsList = goodsService.getByUserId(Integer.valueOf(userId));
			for(Goods g:goodsList){
				goodsService.deleteGoods(g.getGoodsId());
			}
			roleDao.deleteRoleByUserId(Integer.valueOf(userId));
			userDao.deleteById(Integer.valueOf(userId));
		System.out.println("ÒÑÉ¾³ý--"+userId);
		}
	}

}
