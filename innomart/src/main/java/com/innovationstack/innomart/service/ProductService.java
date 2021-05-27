package com.innovationstack.innomart.service;

import java.util.List;

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

	public List<Products> getAllProductsByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return productDAO.getAllProductsByCompanyId(companyId);
	}

	public Products getProductById(Long companyId, int productId) {
		// TODO Auto-generated method stub
		return productDAO.getProductById(companyId, productId);
	}
}
