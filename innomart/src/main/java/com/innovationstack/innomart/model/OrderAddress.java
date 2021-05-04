package com.innovationstack.innomart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OrderAddress {
	@Override
	public String toString() {
		return "OrderAddress [id=" + id + ", orderId=" + orderId + ", addressId=" + addressId + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", regionId=" + regionId + ", region=" + region
				+ ", postCode=" + postCode + ", prefix=" + prefix + ", suffix=" + suffix + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="orderId",nullable=false)
	private Integer orderId;
	@Column(name="addressId",nullable=false)
	private Integer addressId;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedAt;
	@Column(name="regionId",nullable=false)
	private Integer regionId;
	@Column(name="region",nullable=false)
	private String region;
	@Column(name="postCode",nullable=false)
	private String postCode;
	@Column(name="prefix",nullable=false)
	private String prefix;
	@Column(name="suffix",nullable=false)
	private String suffix;

	public OrderAddress() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public OrderAddress(Integer id, Integer orderId, Integer addressId, Date createdAt, Date updatedAt,
			Integer regionId, String region, String postCode, String prefix, String suffix) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.addressId = addressId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.regionId = regionId;
		this.region = region;
		this.postCode = postCode;
		this.prefix = prefix;
		this.suffix = suffix;
	}
}
