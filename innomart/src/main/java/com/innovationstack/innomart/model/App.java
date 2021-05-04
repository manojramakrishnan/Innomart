package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class App {

	public Integer getThemeId() {
		return themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAppDomain() {
		return appDomain;
	}

	public void setAppDomain(String appDomain) {
		this.appDomain = appDomain;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer themeId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="appDomain",nullable=false)
	private String appDomain;
	
	@Override
	public String toString() {
		return "App [themeId=" + themeId + ", companyId=" + companyId + ", status=" + status + ", appDomain="
				+ appDomain + "]";
	}

	public App() {
		
	}

	public App(Integer themeId, Integer companyId, Integer status, String appDomain) {
		super();
		this.themeId = themeId;
		this.companyId = companyId;
		this.status = status;
		this.appDomain = appDomain;
	}
}
