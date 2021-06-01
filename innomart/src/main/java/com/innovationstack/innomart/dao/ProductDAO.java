package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.repositories.ProductRepository;

@Component("productDAO")
public class ProductDAO {

	@Autowired
	private ProductRepository productRepository;

	public Products saveProducts(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	public List<Products> getAllProductsByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		String companysId = companyId.toString();
		return productRepository.getAllProductsByCompanyId(Integer.parseInt(companysId));
	}

	public Products getProductById(Long companyId, int productId) {
		// TODO Auto-generated method stub
		String companysId = companyId.toString();
		return productRepository.getProductById(Integer.parseInt(companysId),productId);
	}

	public List<Products> getProductByCompanyIdAndCategoryId(Long companyId, Long categoryId) {
		// TODO Auto-generated method stub
		return productRepository.getProductByCompanyIdAndCategoryId(companyId,categoryId);
	}

	public Iterable<Products> getProductById(Long companyId, List<Integer> productIds) {
		// TODO Auto-generated method stub
		String companyIds = companyId.toString();
		return productRepository.getProductById(Integer.parseInt(companyIds), productIds);
		
	}




	
}
