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
public class UsersTokens {
	
	@Override
	public String toString() {
		return "UsersTokens [id=" + id + ", companyId=" + companyId + ", userId=" + userId + ", loginDate="
				+ loginDate + ", expirationDate=" + expirationDate + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "userstokens_id")
	private String id;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="userid",nullable=false)
	private String userId;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date loginDate;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date expirationDate;
	
	public UsersTokens() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public java.util.Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(java.util.Date loginDate) {
		this.loginDate = loginDate;
	}

	public java.util.Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(java.util.Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public UsersTokens(String id, Integer companyId, String userId, Date loginDate, Date expirationDate) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.userId = userId;
		this.loginDate = loginDate;
		this.expirationDate = expirationDate;
	}
	
}
