package com.sms.entity;

import javax.persistence.Embeddable;

//@Embeddable
public class Roles {
	
	private int role_user_id;
	private String user_role;
	
	public int getUserId() {
		return role_user_id;
	}
	public void setUserId(int userId) {
		this.role_user_id = userId;
	}
	public String getUserRole() {
		return user_role;
	}
	public void setUserRole(String userRole) {
		this.user_role = userRole;
	}
	
	
	
	
	

}
