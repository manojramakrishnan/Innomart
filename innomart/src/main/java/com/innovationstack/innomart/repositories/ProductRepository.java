package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.Products;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Products, Integer> {

	@Query("SELECT p FROM Products p WHERE  p.companyId = :companyId")
	List<Products> getAllProductsByCompanyId(Integer companyId);
	
	@Query("SELECT p FROM Products p WHERE p.companyId = :companyId And p.id = :productId")
	Products getProductById(Integer companyId, int productId);
	
	@Query("SELECT p FROM Products p WHERE p.companyId = :companyId And p.id = :categoryId")
	List<Products> getProductByCompanyIdAndCategoryId(Long companyId, Long categoryId);
	
	@Query ("SELECT p FROM Products p WHERE p.companyId = :companyId And p.id IN  (:productIds)")
	Iterable<Products> getProductById(@Param ("companyId") Integer companyId, @Param ("productIds") List<Integer>productIds);


}
