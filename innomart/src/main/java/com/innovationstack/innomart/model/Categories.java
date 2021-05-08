package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	@Override
	public String toString() {
		return "Categories [id=" + id + ", companyId=" + companyId + ", parentId=" + parentId
				+ ", appName=" + appName + ", status=" + status + ", description=" + description + "]";
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer id;
	@Column(name="company_id",nullable=false)
	private Integer companyId;
	@Column(name="parentid",nullable=false)
	private Integer parentId;
	@Column(name="appname",nullable=false)
	private String appName;
	@Column(name="status",nullable=false)
	private Integer status;
	
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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAppName() {
		return appName;
	}

	public void setName(String appName) {
		this.appName = appName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="description",nullable=false)
	private String description;
	
	public Categories(Integer id, Integer companyId, Integer parentId, String appName, Integer status,
			String description) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.parentId = parentId;
		this.appName = appName;
		this.status = status;
		this.description = description;
	}

	public Categories() {
		
	}
}
