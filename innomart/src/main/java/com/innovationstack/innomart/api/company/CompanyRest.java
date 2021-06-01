package com.innovationstack.innomart.api.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.request.model.CategoryRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.model.Companies;
import com.innovationstack.innomart.service.CompanyService;




@RestController
@RequestMapping(Mappings.Company)
public class CompanyRest extends AbstractBaseController{
	
	@Autowired
	private CompanyService companyService;


	@RequestMapping(path = Mappings.GET_ALL_COMPANIES, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getCompanies(){
	List<Companies>  list= companyService.getAllCompanies();
	return responseUtil.successResponse(list);
		
	}

	@RequestMapping(path = Mappings.GET_COMPANY_BY_ID, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>getCompanyById(@RequestParam Long companyId) {
		Companies find = companyService.findByCompanyId(companyId);
		return responseUtil.successResponse(find);
	}
}