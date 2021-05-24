package com.innovationstack.innomart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.CompanyDAO;
import com.innovationstack.innomart.model.Companies;



@Service("companyService")
public class CompanyService {
	
	@Autowired
	private CompanyDAO companyDAO;

	public List<Companies> getAllCompanies() {
		// TODO Auto-generated method stub
		return companyDAO.findAllCompanies();
	}



	public Companies findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return companyDAO.findBYCompanyId(companyId);

	}


	

	
	

}
