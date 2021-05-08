//package com.innovationstack.innomart.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Roles {
//	@Override
//	public String toString() {
//		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", description=" + description + "]";
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer roleId;
//	@Column(name="rolename",nullable=false)
//	private String roleName;
//	@Column(name="description",nullable=false)
//	private String description;
//	
//	public Roles () {
//		
//	}
//
//	public Integer getRoleId() {
//		return roleId;
//	}
//
//	public void setRoleId(Integer roleId) {
//		this.roleId = roleId;
//	}
//
//	public String getRoleName() {
//		return roleName;
//	}
//
//	public void setRoleName(String roleName) {
//		this.roleName = roleName;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Roles(Integer roleId, String roleName, String description) {
//		super();
//		this.roleId = roleId;
//		this.roleName = roleName;
//		this.description = description;
//	}
//
//}
