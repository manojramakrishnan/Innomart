package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Categories;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Categories, Integer> {


}
