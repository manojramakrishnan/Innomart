package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderPayments {
	@Override
	public String toString() {
		return "OrderPayments [orderID=" + orderID + ", paymentId=" + paymentId + ", transactionId=" + transactionId
				+ ", status=" + status + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderID;
	@Column(name="paymentId",nullable=false)
	private Integer paymentId;
	@Column(name="transactionId",nullable=false)
	private String transactionId;
	@Column(name="status",nullable=false)
	private Integer status;
	
	public OrderPayments() {
		
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public OrderPayments(Integer orderID, Integer paymentId, String transactionId, Integer status) {
		super();
		this.orderID = orderID;
		this.paymentId = paymentId;
		this.transactionId = transactionId;
		this.status = status;
	}

}
