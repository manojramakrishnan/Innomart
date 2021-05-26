package com.innovationstack.innomart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategories {
	
	
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
