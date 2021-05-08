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
public class History {
	@Override
	public String toString() {
		return "History [id=" + id + ", companyId=" + companyId + ", companyType=" + companyType + ", createDate="
				+ createDate + ", companyValue=" + companyValue + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "history_id")
	private Integer id;
	@Column(name="company_id",nullable=false)
	private Integer companyId;
	@Column(name="companytype",nullable=false)
	private Integer companyType;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	@Column(name="companyvalue",nullable=false)
	private String companyValue;
	
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

	public Integer getCompanyType() {
		return companyType;
	}

	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public String getCompanyValue() {
		return companyValue;
	}

	public void setCompanyValue(String companyValue) {
		this.companyValue = companyValue;
	}

	public History(Integer id, Integer companyId, Integer companyType, Date createDate, String companyValue) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.companyType = companyType;
		this.createDate = createDate;
		this.companyValue = companyValue;
	}

	public History() {
		
	}

}
