package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reviews {
	
	@Override
	public String toString() {
		return "Reviews [id=" + id + ", userId=" + userId + ", productId=" + productId + ", companyId="
				+ companyId + ", productRank=" + productRank + ", comment=" + comment + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="userid",nullable=false)
	private String userId;
	@Column(name="productid",nullable=false)
	private Integer productId;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="productrank",nullable=false)
	private Integer productRank;
	@Column(name="comment",nullable=false)
	private String comment;
	
	public Reviews() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getProductRank() {
		return productRank;
	}

	public void setRank(Integer productRank) {
		this.productRank = productRank;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Reviews(Integer id, String userId, Integer productId, Integer companyId, Integer productRank,
			String comment) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.companyId = companyId;
		this.productRank = productRank;
		this.comment = comment;
	}
	
}
