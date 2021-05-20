package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Categories;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Categories, Integer> {

	@Query("SELECT c FROM Categories c WHERE  c.companyId = :companyId")
	  List<Categories>  findByCompanyId(Long companyId);

	@Query("SELECT c FROM Categories c WHERE  c.id = :categoryId")
	Categories findBYCategoryId(int categoryId);

	@Query("SELECT c FROM Categories c WHERE c.id = :categoryId AND c.companyId = :companyId And c.status = :status")
	Categories findByCompanyId(Long companyId, Integer categoryId, int status);




}
