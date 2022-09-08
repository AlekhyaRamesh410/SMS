package com.sms.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import antlr.collections.List;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer id;

	@Column(name = "user_name")
	private String username;

	@Column(name = "user_passwd")
	private String password;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_role")
	private String user_role;

	@Column(name = "user_role_id")
	private int user_role_id;

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Set<String> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<String> roles) {
//		this.roles = roles;
//	}

//	public ArrayList<Roles> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(ArrayList<Roles> roles) {
//		this.roles = roles;
//	}

}
