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
public class Orders {
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", companyId=" + companyId + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", isActive=" + isActive + ", isVirtual=" + isVirtual
				+ ", isMultishipping=" + isMultishipping + ", status=" + status + ", itemsCount=" + itemsCount
				+ ", itemsQuantity=" + itemsQuantity + ", grandTotal=" + grandTotal + ", baseGrandTotal="
				+ baseGrandTotal + ", checkoutComment=" + checkoutComment + ", customerEmail=" + customerEmail
				+ ", customerPrefix=" + customerPrefix + ", customerFirstname=" + customerFirstname
				+ ", customerMiddlename=" + customerMiddlename + ", customerLastname=" + customerLastname
				+ ", customerSuffix=" + customerSuffix + ", customerDob=" + customerDob + ", customerIsGuest="
				+ customerIsGuest + ", remoteIp=" + remoteIp + ", customerGender=" + customerGender + ", subtotal="
				+ subtotal + ", baseSubtotal=" + baseSubtotal + ", isChanged=" + isChanged + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="userId",nullable=false)
	private String userId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedAt;
	@Column(name="isActive",nullable=false)
	private Integer isActive;
	@Column(name="isVirtual",nullable=false)
	private Integer isVirtual;
	@Column(name="isMultishipping",nullable=false)
	private Integer isMultishipping;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="itemscount",nullable=false)
	private Integer itemsCount;
	@Column(name="itemsQuantity",nullable=false)
	private Float itemsQuantity;
	@Column(name="grandTotal",nullable=false)
	private Float grandTotal;
	@Column(name="baseGrandTotal",nullable=false)
	private Float baseGrandTotal;
	@Column(name="checkoutComment",nullable=false)
	private String checkoutComment;
	@Column(name="customerEmail",nullable=false)
	private String customerEmail;
	@Column(name="customerPrefix",nullable=false)
	private String customerPrefix;
	@Column(name="customerFirstname",nullable=false)
	private String customerFirstname;
	@Column(name="customermiddlename",nullable=false)
	private String customerMiddlename;
	@Column(name="customerLastname",nullable=false)
	private String customerLastname;
	@Column(name="customerSuffix",nullable=false)
	private String customerSuffix;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date customerDob;
	@Column(name="customerIsGuest",nullable=false)
	private Integer customerIsGuest;
	@Column(name="remoteIp",nullable=false)
	private String remoteIp;
	@Column(name="customerGender",nullable=false)
	private String customerGender;
	@Column(name="subtotal",nullable=false)
	private	Float subtotal;
	@Column(name="baseSubtotal",nullable=false)
	private Float baseSubtotal;
	@Column(name="isChanged",nullable=false)
	private Integer isChanged;
	
	public Orders () {
		
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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Integer getIsVirtual() {
		return isVirtual;
	}

	public void setIsVirtual(Integer isVirtual) {
		this.isVirtual = isVirtual;
	}

	public Integer getIsMultishipping() {
		return isMultishipping;
	}

	public void setIsMultishipping(Integer isMultishipping) {
		this.isMultishipping = isMultishipping;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(Integer itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Float getItemsQuantity() {
		return itemsQuantity;
	}

	public void setItemsQuantity(Float itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}

	public Float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Float getBaseGrandTotal() {
		return baseGrandTotal;
	}

	public void setBaseGrandTotal(Float baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public String getCheckoutComment() {
		return checkoutComment;
	}

	public void setCheckoutComment(String checkoutComment) {
		this.checkoutComment = checkoutComment;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPrefix() {
		return customerPrefix;
	}

	public void setCustomerPrefix(String customerPrefix) {
		this.customerPrefix = customerPrefix;
	}

	public String getCustomerFirstname() {
		return customerFirstname;
	}

	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}

	public String getCustomerMiddlename() {
		return customerMiddlename;
	}

	public void setCustomerMiddlename(String customerMiddlename) {
		this.customerMiddlename = customerMiddlename;
	}

	public String getCustomerLastname() {
		return customerLastname;
	}

	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	public String getCustomerSuffix() {
		return customerSuffix;
	}

	public void setCustomerSuffix(String customerSuffix) {
		this.customerSuffix = customerSuffix;
	}

	public java.util.Date getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(java.util.Date customerDob) {
		this.customerDob = customerDob;
	}

	public Integer getCustomerIsGuest() {
		return customerIsGuest;
	}

	public void setCustomerIsGuest(Integer customerIsGuest) {
		this.customerIsGuest = customerIsGuest;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public Float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public Float getBaseSubtotal() {
		return baseSubtotal;
	}

	public void setBaseSubtotal(Float baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
	}

	public Integer getIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Integer isChanged) {
		this.isChanged = isChanged;
	}

	public Orders(Integer id, String userId, Integer companyId, Date createdAt, Date updatedAt, Integer isActive,
			Integer isVirtual, Integer isMultishipping, Integer status, Integer itemsCount, Float itemsQuantity,
			Float grandTotal, Float baseGrandTotal, String checkoutComment, String customerEmail, String customerPrefix,
			String customerFirstname, String customerMiddlename, String customerLastname, String customerSuffix,
			Date customerDob, Integer customerIsGuest, String remoteIp, String customerGender, Float subtotal,
			Float baseSubtotal, Integer isChanged) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyId = companyId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isActive = isActive;
		this.isVirtual = isVirtual;
		this.isMultishipping = isMultishipping;
		this.status = status;
		this.itemsCount = itemsCount;
		this.itemsQuantity = itemsQuantity;
		this.grandTotal = grandTotal;
		this.baseGrandTotal = baseGrandTotal;
		this.checkoutComment = checkoutComment;
		this.customerEmail = customerEmail;
		this.customerPrefix = customerPrefix;
		this.customerFirstname = customerFirstname;
		this.customerMiddlename = customerMiddlename;
		this.customerLastname = customerLastname;
		this.customerSuffix = customerSuffix;
		this.customerDob = customerDob;
		this.customerIsGuest = customerIsGuest;
		this.remoteIp = remoteIp;
		this.customerGender = customerGender;
		this.subtotal = subtotal;
		this.baseSubtotal = baseSubtotal;
		this.isChanged = isChanged;
	}
}
