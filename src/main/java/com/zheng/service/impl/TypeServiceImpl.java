package com.zheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zheng.dao.TypeDao;
import com.zheng.entity.Type;
import com.zheng.service.TypeService;

@Component
public class TypeServiceImpl implements TypeService {

	@Resource
	private TypeDao typeDao;

	public List<Type> getTypeTree(String fatherTypeId) {
		List<Type> typeList = typeDao.getAll();
		
		return typeList;
	}
	
	/**
	 * 通过类型名获取类型对象
	 */
	public Type getByName(String name){
		return typeDao.getByName(name);
	}
}
