package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.repositories.CategoryRepository;

@Component("categoryDAO")
public class CategoryDAO {

	@Autowired
	private CategoryRepository categoryRepository;

	
	

	

	public Categories addCategory(Categories add) {
		// TODO Auto-generated method stub
		return categoryRepository.save(add);
	}






	public List<Categories> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return categoryRepository.findByCompanyId(companyId);
	}






	public Categories findByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findBYCategoryId(categoryId);
	}
	
}
