package com.innovationstack.innomart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategoryId {

	@Id
	private long productId;
	@Id
	private long categoryId;
	public ProductCategoryId(long productId, long categoryId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "ProductCategoryId [productId=" + productId + ", categoryId=" + categoryId + "]";
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
		public ProductCategoryId() {
		
	}
}
