package com.zheng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zheng.entity.Notice;

public interface NoticeDao {

	/**
	 * 添加通知
	 * 
	 * @param notice
	 * @return
	 */
	public int add(Notice notice);

	/**
	 * 删除通知
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id);

	/**
	 * 改通知
	 * 
	 * @param notice
	 * @return
	 */
	public int update(Notice notice);
	
	/**
	 * 通过ID获取通知
	 * @param noticeId
	 * @return
	 */
	public Notice getOneNotice(int noticeId);

	/**
	 * 分页取通知
	 * 
	 * @param first
	 * @param number
	 * @return
	 */
	public List<Notice> get(@Param("first") int first,@Param("number") int number);

	
	/**
	 * 获取总数
	 * @return
	 */
	public int getCount();
}
