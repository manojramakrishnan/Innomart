package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	@Column(name = "app_id")
	private Integer id;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="appdomain",nullable=false)
	private String appDomain;
	
	@Override
	public String toString() {
		return "App [id=" + id + ", companyId=" + companyId + ", status=" + status + ", appDomain="
				+ appDomain + "]";
	}

	public Application() {
		
	}

	public Application(Integer id, Integer companyId, Integer status, String appDomain) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.status = status;
		this.appDomain = appDomain;
	}
}
