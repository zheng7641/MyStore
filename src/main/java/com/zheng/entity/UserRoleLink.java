package com.zheng.entity;

public class UserRoleLink {

	private User user;
	private Role role;

	public UserRoleLink() {
		super();
	}

	public UserRoleLink(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRoleLink [user=" + user + ", role=" + role + "]";
	}

}
