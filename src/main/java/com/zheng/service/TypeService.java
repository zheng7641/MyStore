package com.zheng.service;

import java.util.List;

import com.zheng.entity.Type;

public interface TypeService {

	
	public List<Type> getTypeTree(String fatherTypeId);
}
