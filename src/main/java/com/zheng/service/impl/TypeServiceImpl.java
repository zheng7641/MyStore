package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.TypeDao;
import com.zheng.entity.Type;
import com.zheng.service.TypeService;

@Component
public class TypeServiceImpl implements TypeService{

	@Resource
	private TypeDao typeDao;
	
	public String[] getFristType(){
		String[][][] typeArray;
		List<Type> typeList = typeDao.getAll();
		return null;
	}
	
	public String[][] getLastType(){
		
		return null;
	}
	
}
