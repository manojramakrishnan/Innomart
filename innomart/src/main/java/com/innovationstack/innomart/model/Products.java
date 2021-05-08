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
		return "Products [id=" + id + ", companyId=" + companyId + ", productName=" + productName + ", browsingName="
				+ browsingName + ", salePrice=" + salePrice + ", listPrice=" + listPrice + ", defaultImage="
				+ defaultImage + ", overview=" + overview + ", quantity=" + quantity + ", isStockControlled="
				+ isStockControlled + ", status=" + status + ", description=" + description + ", productRank=" + productRank
				+ ", sku=" + sku + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	@Column(name="companyid",nullable=false)
	private Integer companyId;
	@Column(name="productname",nullable=false)
	private String productName;
	@Column(name="browsingName",nullable=false)
	private String browsingName;
	@Column(name="salePrice",nullable=false)
	private Double salePrice;
	@Column(name="listprice",nullable=false)
	private Double listPrice;
	@Column(name="defaultimage",nullable=false)
	private String defaultImage;
	@Column(name="overview",nullable=false)
	private String overview;
	@Column(name="quantity",nullable=false)
	private Integer quantity;
	@Column(name="isstockcontrolled",nullable=false)
	private Integer isStockControlled;
	@Column(name="status",nullable=false)
	private Integer status;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="productrank",nullable=false)
	private Integer productRank;
	@Column(name="sku",nullable=false)
	private String sku;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdOn;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedOn;
	
	public Products() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Integer getProductRank() {
		return productRank;
	}

	public void setProductRank(Integer productRank) {
		this.productRank = productRank;
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

	public Products(Integer id, Integer companyId, String productName, String browsingName, Double salePrice,
			Double listPrice, String defaultImage, String overview, Integer quantity, Integer isStockControlled,
			Integer status, String description, Integer productRank, String sku, Date createdOn, Date updatedOn) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.productName = productName;
		this.browsingName = browsingName;
		this.salePrice = salePrice;
		this.listPrice = listPrice;
		this.defaultImage = defaultImage;
		this.overview = overview;
		this.quantity = quantity;
		this.isStockControlled = isStockControlled;
		this.status = status;
		this.description = description;
		this.productRank = productRank;
		this.sku = sku;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
}
