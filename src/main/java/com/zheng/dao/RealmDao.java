package com.zheng.dao;

import java.util.Set;

public interface RealmDao{

	public Set<String> getRoleByUserName(String userName);
}
