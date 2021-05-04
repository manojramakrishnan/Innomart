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
		return "Reviews [reviewId=" + reviewId + ", userId=" + userId + ", productId=" + productId + ", companyId="
				+ companyId + ", rank=" + rank + ", comment=" + comment + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer reviewId;
	@Column(name="userid",nullable=false)
	private String userId;
	@Column(name="productid",nullable=false)
	private Integer productId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="rank",nullable=false)
	private Integer rank;
	@Column(name="comment",nullable=false)
	private String comment;
	
	public Reviews() {
		
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
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

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Reviews(Integer reviewId, String userId, Integer productId, Integer companyId, Integer rank,
			String comment) {
		super();
		this.reviewId = reviewId;
		this.userId = userId;
		this.productId = productId;
		this.companyId = companyId;
		this.rank = rank;
		this.comment = comment;
	}
	
}
