package com.zheng.service;

import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public interface RealmService {

	public Set<String> getRoleByUserName(String userName);
}
