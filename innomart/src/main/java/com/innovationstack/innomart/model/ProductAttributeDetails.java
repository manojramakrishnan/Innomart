//package com.innovationstack.innomart.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class ProductAttributeDetails {
//	
//	@Override
//	public String toString() {
//		return "ProductAttributeDetails [productId=" + productId + ", attributeId=" + attributeId + ", valueString="
//				+ valueString + ", valueNumber=" + valueNumber + "]";
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer productId;
//	@Column(name="attributeid",nullable=false)
//	private Integer attributeId;
//	@Column(name="valuestring",nullable=false)
//	private String valueString;
//	@Column(name="valuenumber",nullable=false)
//	private Double valueNumber;
//	
//	public ProductAttributeDetails () {
//		
//	}
//
//	public Integer getProductId() {
//		return productId;
//	}
//
//	public void setProductId(Integer productId) {
//		this.productId = productId;
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
//	public String getValueString() {
//		return valueString;
//	}
//
//	public void setValueString(String valueString) {
//		this.valueString = valueString;
//	}
//
//	public Double getValueNumber() {
//		return valueNumber;
//	}
//
//	public void setValueNumber(Double valueNumber) {
//		this.valueNumber = valueNumber;
//	}
//
//	public ProductAttributeDetails(Integer productId, Integer attributeId, String valueString, Double valueNumber) {
//		super();
//		this.productId = productId;
//		this.attributeId = attributeId;
//		this.valueString = valueString;
//		this.valueNumber = valueNumber;
//	}
//}
