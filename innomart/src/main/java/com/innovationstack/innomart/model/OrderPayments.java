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
		return "OrderPayments [id=" + id + ", paymentId=" + paymentId + ", transactionId=" + transactionId
				+ ", status=" + status + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "orderpayments_id")
	private Integer id;
	@Column(name="payment_id",nullable=false)
	private Integer paymentId;
	@Column(name="transactionid",nullable=false)
	private String transactionId;
	@Column(name="status",nullable=false)
	private Integer status;
	
	public OrderPayments() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public OrderPayments(Integer id, Integer paymentId, String transactionId, Integer status) {
		super();
		this.id = id;
		this.paymentId = paymentId;
		this.transactionId = transactionId;
		this.status = status;
	}

}
