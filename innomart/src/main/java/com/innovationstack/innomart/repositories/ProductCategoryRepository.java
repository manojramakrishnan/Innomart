package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.ProductCategories;

@Repository("productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategories, Integer>{
	
	@Query("SELECT r FROM ProductCategories r WHERE  r.id = :productId")
	List<ProductCategories> getProductCategoryByproductId(int productId);

}
