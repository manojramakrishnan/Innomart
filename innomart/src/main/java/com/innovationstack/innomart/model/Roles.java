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
		return "Roles [roleId=" + roleId + ", name=" + name + ", description=" + description + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer roleId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="description",nullable=false)
	private String description;
	
	public Roles () {
		
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Roles(Integer roleId, String name, String description) {
		super();
		this.roleId = roleId;
		this.name = name;
		this.description = description;
	}

}
