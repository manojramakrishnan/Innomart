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
		return "Payments [paymentId=" + paymentId + ", name=" + name + ", desc=" + desc + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer paymentId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="desc",nullable=false)
	private String desc;
	
	public Payments() {
		
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Payments(Integer paymentId, String name, String desc) {
		super();
		this.paymentId = paymentId;
		this.name = name;
		this.desc = desc;
	}
}
