package com.innovationstack.innomart.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.ProductDAO;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.util.Constant;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@PersistenceContext
	private EntityManager entityManager;
	

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
	@Transactional
	public Products update(Products products) {
		Products updateProducts = entityManager.find(Products.class, products.getId());
		Date createdDate= new Date();
		updateProducts.setBrowsingName(products.getBrowsingName());
		updateProducts.setCompanyId(products.getCompanyId());
		updateProducts.setCreatedOn(createdDate);
		updateProducts.setDefaultImage(products.getDefaultImage());
		updateProducts.setDescription(products.getDefaultImage());
		updateProducts.setId(products.getId());
		updateProducts.setIsStockControlled(products.getIsStockControlled());
		updateProducts.setListPrice(products.getListPrice());
		updateProducts.setOverview(products.getOverview());
		updateProducts.setProductName(products.getProductName());
		updateProducts.setProductRank(products.getProductRank());
		updateProducts.setQuantity(products.getQuantity());
		updateProducts.setSalePrice(products.getSalePrice());
		updateProducts.setSku(products.getSku());
		updateProducts.setUpdatedOn(createdDate);
		entityManager.merge(updateProducts);
		return updateProducts;
		
		
	}

	public List<Products> getProductByCompanyIdAndCategoryId(Long companyId, Long categoryId) {
		// TODO Auto-generated method stub
		return productDAO.getProductByCompanyIdAndCategoryId(companyId,categoryId);
	}

	public Iterable<Products> getProductById(Long companyId, List<Long> productIds) {
		// TODO Auto-generated method stub
		return productDAO.getProductById(companyId,productIds);
	}
}
