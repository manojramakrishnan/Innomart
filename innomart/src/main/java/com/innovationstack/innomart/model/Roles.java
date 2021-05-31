package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
	@Override
	public String toString() {
		return "Roles [id=" + id + ", role=" + role + " ]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "roles_id")
	private Integer id;
	@Column(name="role",nullable=false)
	private String role;

	
	public Roles () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}



	public Roles(Integer roleId, String role) {
		super();
		this.id = roleId;
		this.role = role;
			}

}
