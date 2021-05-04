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
public class Suppliers {
	
	@Override
	public String toString() {
		return "Suppliers [supplierId=" + supplierId + ", companyId=" + companyId + ", name=" + name + ", description="
				+ description + ", status=" + status + ", createDate=" + createDate + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer supplierId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="status",nullable=false)
	private Integer status;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	
	public Suppliers() {
		
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

	public Suppliers(Integer supplierId, Integer companyId, String name, String description, Integer status,
			Date createDate) {
		super();
		this.supplierId = supplierId;
		this.companyId = companyId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.createDate = createDate;
	}
	
}
