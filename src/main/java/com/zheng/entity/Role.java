package com.zheng.entity;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Role {
	private int roleId;
	private String roleName;
	private List<User> user;

	public Role() {
		super();
	}
	
	public Role(String roleName){
		super();
		this.roleName = roleName;
	}
	
	public Role(int roleId, String roleName, List<User> user) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.user = user;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", user=" + user + "]";
	}

}
