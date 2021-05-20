package com.innovationstack.innomart.api.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.request.model.CategoryRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.service.CategoryService;
import com.innovationstack.innomart.util.Constant;


@RestController
@RequestMapping(Mappings.Category)
public class CategoryRest extends AbstractBaseController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(path = Mappings.ADD_CATEGORY, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> addCategory(@PathVariable Long companyId, @RequestBody CategoryRM category) {
		
				
		
			Categories add = new Categories();
			add.setCompanyId(companyId);
			add.setDescription(category.getDescription());
			add.setName(category.getAppName());
			add.setParentId(category.getParentId());
			add.setStatus(Constant.CATEGORY_STATUS.ACTIVE.getStatus());
			categoryService.save(add);
			return responseUtil.successResponse(add);

	}

	@RequestMapping(path = Mappings.GET_CATEGORY, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getCategoryList(@PathVariable Long companyId) {
	List<Categories>  list= categoryService.getCategoryByCompanyId(companyId);
		return responseUtil.successResponse(list);

	}
	@RequestMapping(path = Mappings.UPDATE_CATEGORY, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>updateCAtegory(@PathVariable Long companyId, @RequestBody CategoryRM category) {
		Categories update = categoryService.findByCategoryId(category.getCategoryId());
		if(category != null) {
			update.setCompanyId(category.getCompanyId());
			update.setDescription(category.getDescription());
			update.setId(category.getCategoryId());
			update.setName(category.getAppName());
			update.setParentId(category.getParentId());
			categoryService.update(update);
			
		}
		return responseUtil.successResponse(update);
		
	
	}
}