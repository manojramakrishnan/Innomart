package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.repositories.ProductCategoryRepository;

@Component("productCategoryDAO")
public class ProductCategoryDAO {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	public void saveProductCategories(ProductCategories productCategories) {
		// TODO Auto-generated method stub
		productCategoryRepository.save(productCategories);
	}

	public List<ProductCategories> getProductCategoyByProductId(int productId) {
		// TODO Auto-generated method stub
		return productCategoryRepository.getProductCategoryByproductId(productId);
	}

}
