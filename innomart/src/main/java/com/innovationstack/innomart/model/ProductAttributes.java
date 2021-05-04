package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductAttributes {
	
	@Override
	public String toString() {
		return "ProductAttributes [attributeId=" + attributeId + ", companyId=" + companyId + ", name=" + name + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer attributeId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="name",nullable=false)
	private String name;
	
	public ProductAttributes () {
		
	}

	public Integer getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
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

	public ProductAttributes(Integer attributeId, Integer companyId, String name) {
		super();
		this.attributeId = attributeId;
		this.companyId = companyId;
		this.name = name;
	}
}
