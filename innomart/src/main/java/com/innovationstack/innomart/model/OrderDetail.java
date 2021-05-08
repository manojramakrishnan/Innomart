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
public class OrderDetail {
	
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", parentId=" + parentId + ", orderId=" + orderId + ", productId=" + productId
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", isVirtual=" + isVirtual + ", sku=" + sku
				+ ", orderName=" + orderName + ", description=" + description + ", freeShipping=" + freeShipping + ", weight="
				+ weight + ", quantity=" + quantity + ", price=" + price + ", basePrice=" + basePrice + ", rowTotal="
				+ rowTotal + ", baseRowTotal=" + baseRowTotal + ", rowWeight=" + rowWeight + ", productType="
				+ productType + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "orderdetail_id")
	private Integer id;
	@Column(name="parent_id",nullable=false)
	private Integer parentId;
	@Column(name="order_id",nullable=false)
	private Integer orderId;
	@Column(name="product_id",nullable=false)
	private Integer productId;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedAt;
	@Column(name="isvirtual",nullable=false)
	private Integer isVirtual;
	@Column(name="sku",nullable=false)
	private String sku;
	@Column(name="ordername",nullable=false)
	private String orderName;
	@Column(name="description",nullable=false)
	private String description;
	@Column(name="freeshipping",nullable=false)
	private Integer freeShipping;
	@Column(name="weight",nullable=false)
	private Float weight;
	@Column(name="quantity",nullable=false)
	private Float quantity;
	@Column(name="price",nullable=false)
	private Float price;
	@Column(name="baseprice",nullable=false)
	private Float basePrice;
	@Column(name="rowtotal",nullable=false)
	private Float rowTotal;
	@Column(name="baserowtotal",nullable=false)
	private Float baseRowTotal;
	@Column(name="rowweight",nullable=false)
	private Float rowWeight;
	@Column(name="producttype",nullable=false)
	private String productType;
	
	public OrderDetail() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public Integer getIsVirtual() {
		return isVirtual;
	}

	public void setIsVirtual(Integer isVirtual) {
		this.isVirtual = isVirtual;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFreeShipping() {
		return freeShipping;
	}

	public void setFreeShipping(Integer freeShipping) {
		this.freeShipping = freeShipping;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Float basePrice) {
		this.basePrice = basePrice;
	}

	public Float getRowTotal() {
		return rowTotal;
	}

	public void setRowTotal(Float rowTotal) {
		this.rowTotal = rowTotal;
	}

	public Float getBaseRowTotal() {
		return baseRowTotal;
	}

	public void setBaseRowTotal(Float baseRowTotal) {
		this.baseRowTotal = baseRowTotal;
	}

	public Float getRowWeight() {
		return rowWeight;
	}

	public void setRowWeight(Float rowWeight) {
		this.rowWeight = rowWeight;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public OrderDetail(Integer id, Integer parentId, Integer orderId, Integer productId, Date createdAt, Date updatedAt,
			Integer isVirtual, String sku, String orderName, String description, Integer freeShipping, Float weight,
			Float quantity, Float price, Float basePrice, Float rowTotal, Float baseRowTotal, Float rowWeight,
			String productType) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.orderId = orderId;
		this.productId = productId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isVirtual = isVirtual;
		this.sku = sku;
		this.orderName = orderName;
		this.description = description;
		this.freeShipping = freeShipping;
		this.weight = weight;
		this.quantity = quantity;
		this.price = price;
		this.basePrice = basePrice;
		this.rowTotal = rowTotal;
		this.baseRowTotal = baseRowTotal;
		this.rowWeight = rowWeight;
		this.productType = productType;
	}
}
