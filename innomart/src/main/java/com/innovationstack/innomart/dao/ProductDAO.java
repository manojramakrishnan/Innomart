package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.repositories.ProductRepository;

@Component("productDAO")
public class ProductDAO {

	@Autowired
	private ProductRepository productRepository;

	public void saveProducts(Products products) {
		// TODO Auto-generated method stub
		productRepository.save(products);
	}




	
}
