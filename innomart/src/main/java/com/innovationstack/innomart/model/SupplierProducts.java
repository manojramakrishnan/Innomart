package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierProducts {
	
	@Override
	public String toString() {
		return "SupplierProducts [productId=" + productId + ", supplierId=" + supplierId + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	@Column(name="supplierId",nullable=false)
	private Integer supplierId;
	
	public SupplierProducts() {
		
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public SupplierProducts(Integer productId, Integer supplierId) {
		super();
		this.productId = productId;
		this.supplierId = supplierId;
	}
}
