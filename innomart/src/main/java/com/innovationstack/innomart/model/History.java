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
		return "History [historyId=" + historyId + ", companyId=" + companyId + ", type=" + type + ", createDate="
				+ createDate + ", value=" + value + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer historyId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="type",nullable=false)
	private Integer type;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createDate;
	@Column(name="value",nullable=false)
	private String value;
	
	public Integer getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public History(Integer historyId, Integer companyId, Integer type, Date createDate, String value) {
		super();
		this.historyId = historyId;
		this.companyId = companyId;
		this.type = type;
		this.createDate = createDate;
		this.value = value;
	}

	public History() {
		
	}

}
