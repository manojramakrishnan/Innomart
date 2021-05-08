//package com.innovationstack.innomart.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Payments {
//
//	@Override
//	public String toString() {
//		return "Payments [paymentId=" + paymentId + ", paymentName=" + paymentName + ", description=" + description + "]";
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer paymentId;
//	@Column(name="paymentname",nullable=false)
//	private String paymentName;
//	@Column(name="description",nullable=false)
//	private String description;
//	
//	public Payments() {
//		
//	}
//
//	public Integer getPaymentId() {
//		return paymentId;
//	}
//
//	public void setPaymentId(Integer paymentId) {
//		this.paymentId = paymentId;
//	}
//
//	public String getPaymentName() {
//		return paymentName;
//	}
//
//	public void setPaymentName(String paymentName) {
//		this.paymentName = paymentName;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Payments(Integer paymentId, String paytmentName, String description) {
//		super();
//		this.paymentId = paymentId;
//		this.paymentName = paymentName;
//		this.description = description;
//	}
//}
