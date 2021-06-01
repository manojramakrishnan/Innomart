package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Companies;

@Repository("companyRepository")
public interface CompanyRepository extends JpaRepository<Companies, Integer>{

	@Query("SELECT co FROM Companies co WHERE  co.id = :companyId")
	Companies findByCompanyId(Integer companyId);
	



	
	



	


}
