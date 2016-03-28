package com.zheng.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * ֪ͨ
 * @author zheng
 *
 */
@Component
public class Notice {

	private int noticeId;
	private String noticeTitle;
	private Date createTime;
	private String content;
	public Notice() {
		super();
	}
	public Notice(String noticeTitle, Date createTime, String content) {
		super();
		this.noticeTitle = noticeTitle;
		this.createTime = createTime;
		this.content = content;
	}
	public Notice(int noticeId, String noticeTitle, Date createTime, String content) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.createTime = createTime;
		this.content = content;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", createTime=" + createTime
				+ ", content=" + content + "]";
	}

}
