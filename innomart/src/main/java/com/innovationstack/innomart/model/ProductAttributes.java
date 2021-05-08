//package com.innovationstack.innomart.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class ProductAttributes {
//	
//	@Override
//	public String toString() {
//		return "ProductAttributes [attributeId=" + attributeId + ", companyId=" + companyId + ", productAttributesName=" + productAttributesName + "]";
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer attributeId;
//	@Column(name="companyid",nullable=false)
//	private Integer companyId;
//	@Column(name="productattributesname",nullable=false)
//	private String productAttributesName;
//	
//	public ProductAttributes () {
//		
//	}
//
//	public Integer getAttributeId() {
//		return attributeId;
//	}
//
//	public void setAttributeId(Integer attributeId) {
//		this.attributeId = attributeId;
//	}
//
//	public Integer getCompanyId() {
//		return companyId;
//	}
//
//	public void setCompanyId(Integer companyId) {
//		this.companyId = companyId;
//	}
//
//	public String getProductAttributesName() {
//		return productAttributesName;
//	}
//
//	public void setProductAttributesName(String productAttributesName) {
//		this.productAttributesName = productAttributesName;
//	}
//
//	public ProductAttributes(Integer attributeId, Integer companyId, String productAttributesName) {
//		super();
//		this.attributeId = attributeId;
//		this.companyId = companyId;
//		this.productAttributesName = productAttributesName;
//	}
//}
