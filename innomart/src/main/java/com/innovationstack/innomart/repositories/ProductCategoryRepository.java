package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.ProductCategories;

@Repository("productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategories, Integer>{

}
