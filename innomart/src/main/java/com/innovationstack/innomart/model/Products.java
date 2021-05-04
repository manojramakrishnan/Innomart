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
public class Products {

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", companyId=" + companyId + ", name=" + name + ", browsingName="
				+ browsingName + ", salePrice=" + salePrice + ", listPrice=" + listPrice + ", defaultImage="
				+ defaultImage + ", overview=" + overview + ", quantity=" + quantity + ", isStockControlled="
				+ isStockControlled + ", status=" + status + ", description=" + description + ", rank=" + rank
				+ ", sku=" + sku + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	@Column(name="companyId",nullable=false)
	private Integer companyId;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="browsingName",nullable=false)
	private String browsingName;
	@Column(name="salePrice",nullable=false)
	private Double salePrice;
	@Column(name="listrice",nullable=false)
	private Double listPrice;
	@Column(name="defaultImage",nullable=false)
	private String defaultImage;
	@Column(name="overview",nullable=false)
	private String overview;
	@Column(name="quantity",nullable=false)
	private Integer quantity;
	@Column(name="isStockControlled",nullable=false)
	private Integer isStockControlled;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="rank",nullable=false)
	private Integer rank;
	@Column(name="sku",nullable=false)
	private String sku;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdOn;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedOn;
	
	public Products() {
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrowsingName() {
		return browsingName;
	}

	public void setBrowsingName(String browsingName) {
		this.browsingName = browsingName;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public String getDefaultImage() {
		return defaultImage;
	}

	public void setDefaultImage(String defaultImage) {
		this.defaultImage = defaultImage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getIsStockControlled() {
		return isStockControlled;
	}

	public void setIsStockControlled(Integer isStockControlled) {
		this.isStockControlled = isStockControlled;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public java.util.Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(java.util.Date createdOn) {
		this.createdOn = createdOn;
	}

	public java.util.Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(java.util.Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Products(Integer productId, Integer companyId, String name, String browsingName, Double salePrice,
			Double listPrice, String defaultImage, String overview, Integer quantity, Integer isStockControlled,
			Integer status, String description, Integer rank, String sku, Date createdOn, Date updatedOn) {
		super();
		this.productId = productId;
		this.companyId = companyId;
		this.name = name;
		this.browsingName = browsingName;
		this.salePrice = salePrice;
		this.listPrice = listPrice;
		this.defaultImage = defaultImage;
		this.overview = overview;
		this.quantity = quantity;
		this.isStockControlled = isStockControlled;
		this.status = status;
		this.description = description;
		this.rank = rank;
		this.sku = sku;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
}
