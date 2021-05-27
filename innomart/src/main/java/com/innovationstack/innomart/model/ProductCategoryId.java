package com.innovationstack.innomart.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class ProductCategoryId implements Serializable{

//	@Id
	private Long productId;
//	@Id
	private Long categoryId;
	public ProductCategoryId(Long productId, Long categoryId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "ProductCategoryId [productId=" + productId + ", categoryId=" + categoryId + "]";
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
		public ProductCategoryId() {
		
	}
}
