package com.innovationstack.innomart.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.CategoryDAO;
import com.innovationstack.innomart.model.Categories;

@Service("categoryService")
public class CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	

	
	public Categories save(Categories add) {
		// TODO Auto-generated method stub
		Categories newCategory = categoryDAO.addCategory(add);
		return newCategory;
	}





	public List<Categories> getCategoryByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return categoryDAO.findByCompanyId(companyId) ;
	}




	
	public Categories findByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
	return categoryDAO.findByCategory(categoryId);
	}




	@Transactional
	public Categories update(Categories update) {
		// TODO Auto-generated method stub
		Categories updateCategory = entityManager.find(Categories.class, update.getId());
		updateCategory.setCompanyId(update.getCompanyId());
		updateCategory.setDescription(update.getDescription());
		updateCategory.setId(update.getId());
		updateCategory.setName(update.getAppName());
		updateCategory.setParentId(update.getParentId());
		entityManager.merge(updateCategory);
		return updateCategory;
	}





	public Categories deleteCategoryByCompanyId(Long companyId, Integer categoryId, int status) {
		// TODO Auto-generated method stub
		return categoryDAO.deleteCategoryByCompanyId(companyId, categoryId, status);
	}

	
	
}
