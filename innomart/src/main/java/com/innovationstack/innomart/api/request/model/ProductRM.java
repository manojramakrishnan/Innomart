package com.innovationstack.innomart.api.request.model;

import java.util.Date;
import java.util.List;

public class ProductRM {

	private Integer productId;
	private Integer companyId;
	private String productName;
	private String browsingName;
	private Double salePrice;
	private Double listPrice;
	private String defaultImage;
	private String overview;
	private Integer quantity;
	private Integer isStockControlled;
	private Integer status;
	private String description;
	private Integer productRank;
	private String sku;
	private java.util.Date createdOn;
	private java.util.Date updatedOn;
	private List<Long> categoriesId;
	
	public ProductRM(Integer productId, Integer companyId, String productName, String browsingName, Double salePrice,
			Double listPrice, String defaultImage, String overview, Integer quantity, Integer isStockControlled,
			Integer status, String description, Integer productRank, String sku, Date createdOn, Date updatedOn,
			List<Long> categoriesId) {
		super();
		this.productId = productId;
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
		this.categoriesId = categoriesId;
	}
	@Override
	public String toString() {
		return "ProductRM [productId=" + productId + ", companyId=" + companyId + ", productName=" + productName
				+ ", browsingName=" + browsingName + ", salePrice=" + salePrice + ", listPrice=" + listPrice
				+ ", defaultImage=" + defaultImage + ", overview=" + overview + ", quantity=" + quantity
				+ ", isStockControlled=" + isStockControlled + ", status=" + status + ", description=" + description
				+ ", productRank=" + productRank + ", sku=" + sku + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", categoriesId=" + categoriesId + "]";
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
	public List<Long> getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(List<Long> categoriesId) {
		this.categoriesId = categoriesId;
	}
	
	
	
}
