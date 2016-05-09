package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.zheng.entity.User;

@Component
public interface UserDao {

	/**
	 * ����û�
	 * 
	 * @param user
	 * @return �û�����
	 */
	public int add(User user);

	/**
	 * ɾ���û�
	 * 
	 * @param userName
	 * @return ����
	 */
	public int delete(String userName);
	
	/**
	 * ͨ��IDɾ���û�
	 * @param userId
	 * @return
	 */
	public int deleteById(int userId);
	
	/**
	 * ɾ���û������н�ɫ
	 * 
	 * @param userName
	 * @return ����
	 */
	public int deleteRole(String userName);
	
	/**
	 * �޸��û���Ϣ
	 * 
	 * @param User
	 * @return ����
	 */
	public int update(User user);
	
	/**
	 * ��ȡ�û�ͨ���û���
	 * 
	 * @param name
	 * @return User
	 */
	public User get(String userName);

	/**
	 * ��ȡ�û���Ϣ
	 * @param page
	 * @param num
	 * @return
	 */
	public List<User> getAll(@Param("first")int frist,@Param("number")int number);
	
	/**
	 * ��ȡ�û�����
	 * @return
	 */
	public int getCount();
	
	/**
	 * ��ȡ�û����û������н�ɫ
	 * 
	 * @param userName
	 * @return User
	 */
	public User getUserAndRole(String userName);

	/**
	 * ��ȡ�û�IDͨ���û��˺�
	 * 
	 * @param userName
	 * @return �û�ID
	 */
	public int getId(String userName);
	
	/**
	 * �鿴�û����Ƿ����
	 * 
	 * @param userName
	 * @return count(userName)
	 */
	public int isExist(String userName);
}
