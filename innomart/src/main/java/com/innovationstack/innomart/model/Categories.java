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
		return "Categories [categoryId=" + categoryId + ", companyId=" + companyId + ", parentId=" + parentId
				+ ", name=" + name + ", status=" + status + ", description=" + description + "]";
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer categoryId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="parentId",nullable=false)
	private Integer parentId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="status",nullable=false)
	private Integer status;
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public Categories(Integer categoryId, Integer companyId, Integer parentId, String name, Integer status,
			String description) {
		super();
		this.categoryId = categoryId;
		this.companyId = companyId;
		this.parentId = parentId;
		this.name = name;
		this.status = status;
		this.description = description;
	}

	public Categories() {
		
	}
}
