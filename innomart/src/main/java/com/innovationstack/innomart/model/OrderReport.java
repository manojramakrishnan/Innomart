//package com.innovationstack.innomart.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class OrderReport {
//	@Override
//	public String toString() {
//		return "OrderReport [reportId=" + reportId + ", orderId=" + orderId + ", status=" + status + ", note=" + note
//				+ "]";
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer reportId;
//	@Column(name="orderid",nullable=false)
//	private Integer orderId;
//	@Column(name="status",nullable=false)
//	private Integer status;
//	@Column(name="note",nullable=false)
//	private String note;
//	
//	public OrderReport() {
//		
//	}
//
//	public Integer getReportId() {
//		return reportId;
//	}
//
//	public void setReportId(Integer reportId) {
//		this.reportId = reportId;
//	}
//
//	public Integer getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}
//
//	public Integer getStatus() {
//		return status;
//	}
//
//	public void setStatus(Integer status) {
//		this.status = status;
//	}
//
//	public String getNote() {
//		return note;
//	}
//
//	public void setNote(String note) {
//		this.note = note;
//	}
//
//	public OrderReport(Integer reportId, Integer orderId, Integer status, String note) {
//		super();
//		this.reportId = reportId;
//		this.orderId = orderId;
//		this.status = status;
//		this.note = note;
//	}
//}
