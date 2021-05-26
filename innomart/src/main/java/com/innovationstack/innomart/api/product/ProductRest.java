package com.innovationstack.innomart.api.product;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innovationstack.innomart.api.Mappings;
import com.innovationstack.innomart.api.controller.AbstractBaseController;
import com.innovationstack.innomart.api.request.model.ProductRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.api.response.model.util.ResponseUtil;
import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.ProductCategoryId;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.service.ProductCategoryService;
import com.innovationstack.innomart.service.ProductService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Product)
public class ProductRest extends AbstractBaseController{

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductCategoryService productCategoryService;
	@RequestMapping(path = Mappings.CREATE_PRODUCT, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> createProduct(@RequestBody ProductRM product) {
		try {
		Date createDate = new Date();
		Products products = new Products();
		
		products.setBrowsingName(product.getBrowsingName());
		products.setCompanyId(product.getCompanyId());
		products.setCreatedOn(createDate);
		products.setDefaultImage(product.getDefaultImage());
		products.setDescription(product.getDescription());
		products.setId(product.getProductId());
		products.setIsStockControlled(product.getIsStockControlled());
		products.setListPrice(product.getListPrice());
		products.setOverview(product.getOverview());
		products.setProductName(product.getProductName());
		products.setProductRank(product.getProductRank());
		products.setQuantity(product.getQuantity());
		products.setSalePrice(product.getSalePrice());
		products.setSku(product.getSku());
		products.setStatus(Constant.PRODUCT_STATUS.PENDING.getStatus());
		products.setUpdatedOn(createDate);
		
		productService.save(products);
		
		for(Long categoriesId : product.getCategoriesId()) {
			ProductCategoryId productCategoryId = new ProductCategoryId();
			ProductCategories productCategories= new ProductCategories();
			productCategoryId.setCategoryId(categoriesId);
			productCategoryId.setProductId(products.getId());
			productCategories.setId(productCategoryId);
		productCategoryService.save(productCategories);	
		}
		return responseUtil.successResponse(products);

		}
		
		catch (Exception ex) {
			throw new ApplicationException(RestStatus.CREATE_PRODUCT_ERROR);
		}

	}
}
