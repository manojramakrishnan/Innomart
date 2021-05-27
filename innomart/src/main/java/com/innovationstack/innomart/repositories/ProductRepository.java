package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.Products;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Products, Integer> {

	@Query("SELECT p FROM Products p WHERE  p.companyId = :companyId")
	List<Products> getAllProductsByCompanyId(Long companyId);
	
	@Query("SELECT p FROM Products p WHERE p.companyId = :companyId And p.id = :productId")
	Products getProductById(Long companyId, int productId);


}
