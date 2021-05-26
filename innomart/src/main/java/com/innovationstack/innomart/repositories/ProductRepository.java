package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.Products;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Products, Integer> {


}
