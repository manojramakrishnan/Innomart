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
		return "UsersTokens [token=" + token + ", companyId=" + companyId + ", userId=" + userId + ", loginDate="
				+ loginDate + ", expirationDate=" + expirationDate + ", sessionData=" + sessionData + "]";
	}

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String token;
	@Column(name="company_id",nullable=false)
	private Long companyId;
	@Column(name="user_id",nullable=false)
	private Integer userId;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date loginDate;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date expirationDate;
	
	@Column(name="session_data" , nullable=false)
	private String sessionData;
	
	public String getSessionData() {
		return sessionData;
	}

	public void setSessionData(String sessionData) {
		this.sessionData = sessionData;
	}

	public UsersTokens() {
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
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

	public UsersTokens(String token, Long companyId, Integer userId, Date loginDate, Date expirationDate, String sessionData) {
		super();
		this.token = token;
		this.companyId = companyId;
		this.userId = userId;
		this.loginDate = loginDate;
		this.expirationDate = expirationDate;
		this.sessionData = sessionData;
	}
	
}
