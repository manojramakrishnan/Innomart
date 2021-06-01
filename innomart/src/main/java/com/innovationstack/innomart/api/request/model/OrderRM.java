package com.innovationstack.innomart.api.request.model;

import java.util.List;

import com.innovationstack.innomart.model.ProductInfo;

public class OrderRM {

	private UserRM user;
	private List<ProductInfo> productList;
	public List<ProductInfo> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductInfo> productList) {
		this.productList = productList;
	}
	private long paymentId;
		
	public OrderRM(UserRM user, long paymentId) {
		super();
		this.user = user;
		this.paymentId = paymentId;
	}
	@Override
	public String toString() {
		return "OrderRM [user=" + user + ", paymentId=" + paymentId + "]";
	}
	public UserRM getUser() {
		return user;
	}
	public void setUser(UserRM user) {
		this.user = user;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
	
	}
