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
		return "Suppliers [id=" + id + ", companyId=" + companyId + ", supplierName=" + supplierName + ", description="
				+ description + ", status=" + status + ", createDate=" + createDate + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "suppliers_id")
	private Integer id;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="suppliername",nullable=false)
	private String supplierName;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="status",nullable=false)
	private Integer status;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	
	public Suppliers() {
		
	}

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

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public Suppliers(Integer id, Integer companyId, String supplierName, String description, Integer status,
			Date createDate) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.supplierName = supplierName;
		this.description = description;
		this.status = status;
		this.createDate = createDate;
	}
	
}
