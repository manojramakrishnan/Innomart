package com.innovationstack.innomart.api.request.model;

import java.util.Date;

public class OrderRM {

	private UserRM user;
	//private list<ProductInfo> productList;
	private long PaymentId;
		
	public OrderRM(UserRM user, long paymentId) {
		super();
		this.user = user;
		PaymentId = paymentId;
	}
	@Override
	public String toString() {
		return "OrderRM [user=" + user + ", PaymentId=" + PaymentId + "]";
	}
	public UserRM getUser() {
		return user;
	}
	public void setUser(UserRM user) {
		this.user = user;
	}
	public long getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(long paymentId) {
		PaymentId = paymentId;
	}
	
	
	}
