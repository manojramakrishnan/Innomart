package com.innovationstack.innomart.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ProductCategories {
	
	@EmbeddedId
	private ProductCategoryId id;
	
	
	public ProductCategories(ProductCategoryId id) {
		super();
		this.id = id;
	}


	@Override
	public String toString() {
		return "ProductCategories [id=" + id + "]";
	}


	public ProductCategoryId getId() {
		return id;
	}


	public void setId(ProductCategoryId id) {
		this.id = id;
	}


	public ProductCategories() {
		
	}

	}
