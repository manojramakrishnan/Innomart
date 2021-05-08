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
		return "ProductAttributes [id=" + id + ", companyId=" + companyId + ", productAttributesName=" + productAttributesName + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "productattributes_id")
	private Integer id;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="productattributesname",nullable=false)
	private String productAttributesName;
	
	public ProductAttributes () {
		
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

	public String getProductAttributesName() {
		return productAttributesName;
	}

	public void setProductAttributesName(String productAttributesName) {
		this.productAttributesName = productAttributesName;
	}

	public ProductAttributes(Integer id, Integer companyId, String productAttributesName) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.productAttributesName = productAttributesName;
	}
}
