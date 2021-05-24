package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.model.Companies;

@Repository("companyRepository")
public interface CompanyRepository extends JpaRepository<Companies, Integer>{

	@Query("SELECT s FROM Companies s WHERE  s.id = :companyId")
	Companies findByCompanyId(Integer companyId);
	



	
	



	


}
