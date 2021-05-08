package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderReport {
	@Override
	public String toString() {
		return "OrderReport [id=" + id + ", orderId=" + orderId + ", status=" + status + ", note=" + note
				+ "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "orderreport_id")
	private Integer id;
	@Column(name="order_id",nullable=false)
	private Integer orderId;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="note",nullable=false)
	private String note;
	
	public OrderReport() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public OrderReport(Integer id, Integer orderId, Integer status, String note) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.status = status;
		this.note = note;
	}
}
