package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategories {
	
	@Override
	public String toString() {
		return "ProductCategories [productId=" + productId + ", categoryId=" + categoryId + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	@Column(name="categoryId",nullable=false)
	private Integer categoryId;
	
	public ProductCategories() {
		
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public ProductCategories(Integer productId, Integer categoryId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
	}
}
