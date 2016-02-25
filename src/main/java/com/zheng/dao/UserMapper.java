package com.zheng.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zheng.entity.User;

@Repository  
@Transactional 
public interface UserMapper {

	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);
}
