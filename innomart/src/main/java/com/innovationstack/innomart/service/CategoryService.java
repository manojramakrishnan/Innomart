package com.innovationstack.innomart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.CategoryDAO;
import com.innovationstack.innomart.model.Categories;

@Service("categoryService")
public class CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	
	

	
	public Categories save(Categories add) {
		// TODO Auto-generated method stub
		Categories newCategory = categoryDAO.addCategory(add);
		return newCategory;
	}

	
	
}
