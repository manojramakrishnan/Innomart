package com.innovationstack.innomart.dao;

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
	
}
