package com.innovationstack.innomart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Users {
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", companyId=" + companyId + ", groupId=" + groupId + ", roleId=" + roleId
				+ ", email=" + email + ", passwordHash=" + passwordHash + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", status=" + status + ", createDate=" + createDate
				+ ", salt=" + salt + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="groupId",nullable=false)
	private Integer groupId;
	@Column(name="roleId",nullable=false)
	private Integer roleId;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="passwordHash",nullable=false)
	private String passwordHash;
	@Column(name="firstName",nullable=false)
	private String firstName;
	@Column(name="middleName",nullable=false)
	private String middleName;
	@Column(name="lastName",nullable=false)
	private String lastName;
	@Column(name="status",nullable=false)
	private Integer status;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	@Column(name="salt",nullable=false)
	private String salt;
	
	public Users() {
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Users(String userId, Integer companyId, Integer groupId, Integer roleId, String email, String passwordHash,
			String firstName, String middleName, String lastName, Integer status, Date createDate, String salt) {
		super();
		this.userId = userId;
		this.companyId = companyId;
		this.groupId = groupId;
		this.roleId = roleId;
		this.email = email;
		this.passwordHash = passwordHash;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.status = status;
		this.createDate = createDate;
		this.salt = salt;
	}

}
