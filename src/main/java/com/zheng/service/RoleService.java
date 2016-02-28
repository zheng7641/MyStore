package com.zheng.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface RoleService {

	public List<String> getRoleByUserName(String userName);
}
