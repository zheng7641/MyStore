package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Notice;

public interface NoticeDao {

	/**
	 * ���֪ͨ
	 * 
	 * @param notice
	 * @return
	 */
	public int add(Notice notice);

	/**
	 * ɾ��֪ͨ
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id);

	/**
	 * ��֪ͨ
	 * 
	 * @param notice
	 * @return
	 */
	public int update(Notice notice);
	
	/**
	 * ͨ��ID��ȡ֪ͨ
	 * @param noticeId
	 * @return
	 */
	public Notice getOneNotice(int noticeId);

	/**
	 * ��ҳȡ֪ͨ
	 * 
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Notice> get(@Param("first") int first,@Param("number") int number);

	
	/**
	 * ��ȡ����
	 * @return
	 */
	public int getCount();
}
