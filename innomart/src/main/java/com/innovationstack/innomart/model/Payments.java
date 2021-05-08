package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payments {

	@Override
	public String toString() {
		return "Payments [id=" + id + ", paymentName=" + paymentName + ", description=" + description + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "payments_id")
	private Integer id;
	@Column(name="paymentname",nullable=false)
	private String paymentName;
	@Column(name="description",nullable=false)
	private String description;
	
	public Payments() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Payments(Integer id, String paytmentName, String description) {
		super();
		this.id = id;
		this.paymentName = paymentName;
		this.description = description;
	}
}
