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
		return "SupplierProducts [id=" + id + ", supplierId=" + supplierId + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "supplierproducts_id")
	private Integer id;
	@Column(name="suppliers_id",nullable=false)
	private Integer supplierId;
	
	public SupplierProducts() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public SupplierProducts(Integer id, Integer supplierId) {
		super();
		this.id = id;
		this.supplierId = supplierId;
	}
}
