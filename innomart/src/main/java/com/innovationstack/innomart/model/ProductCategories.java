package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategories {
	
	@Override
	public String toString() {
		return "ProductCategories [id=" + id + ", categoryId=" + categoryId + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "productcategories_id")
	private Integer id;
	@Column(name="categoryid",nullable=false)
	private Integer categoryId;
	
	public ProductCategories() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public ProductCategories(Integer id, Integer categoryId) {
		super();
		this.id = id;
		this.categoryId = categoryId;
	}
}
