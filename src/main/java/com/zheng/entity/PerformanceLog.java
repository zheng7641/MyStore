package com.zheng.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class PerformanceLog {

	private int logId;
	private String functionName;
	private Date createTime;
	private String duration;

	public PerformanceLog() {
		super();
	}

	public PerformanceLog(String functionName, Date createTime, String duration) {
		super();
		this.functionName = functionName;
		this.createTime = createTime;
		this.duration = duration;
	}

	public PerformanceLog(int logId, String functionName, Date createTime, String duration) {
		super();
		this.logId = logId;
		this.functionName = functionName;
		this.createTime = createTime;
		this.duration = duration;
	}

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "PerformanceLog [logId=" + logId + ", functionName=" + functionName + ", createTime=" + createTime
				+ ", duration=" + duration + "]";
	}

}
