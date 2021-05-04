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
public class Companies {
	@Override
	public String toString() {
		return "Companies [companiesId=" + companiesId + ", name=" + name + ", status=" + status + ", createDate="
				+ createDate + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer companiesId;
	@Column(name="name",nullable=false)
    private String name;
	@Column(name="status",nullable=false)
	private Integer status;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	
	public Integer getCompaniesId() {
		return companiesId;
	}

	public void setCompaniesId(Integer companiesId) {
		this.companiesId = companiesId;
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

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public Companies() {
		
	}

	public Companies(Integer companiesId, String name, Integer status, Date createDate) {
		super();
		this.companiesId = companiesId;
		this.name = name;
		this.status = status;
		this.createDate = createDate;
	}
}
