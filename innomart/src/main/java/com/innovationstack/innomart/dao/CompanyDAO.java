package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Companies;
import com.innovationstack.innomart.repositories.CompanyRepository;




@Component("companyDAO")
public class CompanyDAO {
	
	@Autowired
	private CompanyRepository companyRepository;

	public List<Companies> findAllCompanies() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}



	public Companies findBYCompanyId(Long companyId) {
		String cid = companyId.toString();
		return companyRepository.findByCompanyId(Integer.valueOf(cid));

	}
	

	
}




	




