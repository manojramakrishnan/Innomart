package com.innovationstack.innomart.model;

public class ProductInfo {
	
	public long productId;
	public int quantity;
	
	public ProductInfo() {}
	
	public ProductInfo(long productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", quantity=" + quantity + "]";
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
