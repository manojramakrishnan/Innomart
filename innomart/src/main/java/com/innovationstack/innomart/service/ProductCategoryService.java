package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.ProductCategoryDAO;
import com.innovationstack.innomart.model.ProductCategories;

@Service("productCatgeoryService")
public class ProductCategoryService {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	
	public void save(ProductCategories productCategories) {
		// TODO Auto-generated method stub
		productCategoryDAO.saveProductCategories(productCategories);
	}

}
