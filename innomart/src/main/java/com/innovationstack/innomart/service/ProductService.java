package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.ProductDAO;
import com.innovationstack.innomart.model.Products;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	public void save(Products products) {
		// TODO Auto-generated method stub
		productDAO.saveProducts(products);
		
	}
}
