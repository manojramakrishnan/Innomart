package com.innovationstack.innomart.api.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.innovationstack.innomart.api.request.model.ProductRM;
import com.innovationstack.innomart.api.response.model.RestResponse;
import com.innovationstack.innomart.api.response.model.util.ResponseUtil;
import com.innovationstack.innomart.api.response.model.util.RestStatus;
import com.innovationstack.innomart.exception.ApplicationException;
import com.innovationstack.innomart.model.Categories;
import com.innovationstack.innomart.model.Orders;
import com.innovationstack.innomart.model.ProductCategories;
import com.innovationstack.innomart.model.ProductCategoryId;
import com.innovationstack.innomart.model.Products;
import com.innovationstack.innomart.service.CategoryService;
import com.innovationstack.innomart.service.ProductCategoryService;
import com.innovationstack.innomart.service.ProductService;
import com.innovationstack.innomart.util.Constant;

@RestController
@RequestMapping(Mappings.Product)
public class ProductRest extends AbstractBaseController{

	@Autowired
	private CategoryService categoryService;
	
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
//		products.setId(product.getProductId());
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
		
		Products savedProducts = productService.save(products);
		
		for(Long categoriesId : product.getCategoriesId()) {
			ProductCategoryId productCategoryId = new ProductCategoryId();
			ProductCategories productCategories= new ProductCategories();
			productCategoryId.setCategoryId(categoriesId);
			String productId= products.getId().toString();
			productCategoryId.setProductId(Long.parseLong(productId));
			productCategories.setId(productCategoryId);
		productCategoryService.save(productCategories);	
		}
		return responseUtil.successResponse(products);

		}
		
		catch (Exception ex) {
			throw new ApplicationException(RestStatus.CREATE_PRODUCT_ERROR);
		}

	}
		
	@RequestMapping(path = Mappings.GET_ALL_PRODUCTS_BY_COMPANY_ID, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getAllProducts(@PathVariable Long companyId) {
		List<Products>  products= productService.getAllProductsByCompanyId(companyId);
		return responseUtil.successResponse(products);
	}
	
	@RequestMapping(path = Mappings.GET_PRODUCT_BY_ID, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse> getProductById(@PathVariable Long companyId, @PathVariable int productId) {
	Products products = productService.getProductById(companyId, productId);	
		if(products != null) {
			List<ProductCategories> productCategories= productCategoryService.getProductCategoryByProductId(productId);
			List<Map<String,Object>> listCategory= new ArrayList<Map<String,Object>>();
			for(ProductCategories result : productCategories) {
				Map<String,Object> category = new HashMap(); 
						String categoryId= result.getId().getCategoryId().toString();
				Categories categories= categoryService.findByCategoryId(Integer.parseInt(categoryId));
			if(categories != null) {
			category.put("text", categories.getAppName());
			category.put("id", categories.getId());
			}	
			listCategory.add(category);
			}
		Map<String,Object> result= new HashMap();	
		result.put("Products", products);
		result.put("List_Category", listCategory);
		return responseUtil.successResponse(result);
		}
		else {
			throw new ApplicationException(RestStatus.GET_PRODUCT_ERROR);
		}
	}
	@RequestMapping(path = Mappings.UPDATE_PRODUCT, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>updateProduct(@RequestBody ProductRM product) {
		Date createDate = new Date();
		try {
			String productId= product.getProductId().toString();
			String companyId= product.getCompanyId().toString();
			Products products = productService.getProductById(Long.parseLong(companyId),Integer.parseInt(productId));
		if(products != null) {
			products.setBrowsingName(product.getBrowsingName());
			products.setCompanyId(product.getCompanyId());
			products.setCreatedOn(createDate);
			products.setDefaultImage(product.getDefaultImage());
			products.setDescription(product.getDescription());
			products.setIsStockControlled(product.getIsStockControlled());
			products.setListPrice(product.getListPrice());
			products.setOverview(product.getOverview());
			products.setProductName(product.getProductName());
			products.setProductRank(product.getProductRank());
			products.setQuantity(product.getQuantity());
			products.setSalePrice(product.getSalePrice());
			products.setSku(product.getSku());
			products.setUpdatedOn(createDate);
			
			productService.update(products);
			List<ProductCategories> productCategories= productCategoryService.getProductCategoryByProductId(Integer.parseInt(productId));
		for(ProductCategories result : productCategories) {
			productCategoryService.delete(result);
		}
		
		for(Long categoriesId : product.getCategoriesId()) {
			ProductCategoryId productCategoryId = new ProductCategoryId();
			ProductCategories pC = new ProductCategories();
			productCategoryId.setCategoryId(categoriesId);
			String pId= products.getId().toString();
			productCategoryId.setProductId(Long.parseLong(pId));
			pC.setId(productCategoryId);
			productCategoryService.save(pC);	
		}
		return responseUtil.successResponse(products);
		}
		else {
			throw new ApplicationException(RestStatus.GET_PRODUCT_ERROR);
		}
		
		}
		catch (Exception ex) {
			throw new ApplicationException(RestStatus.UPDATE_PRODUCT_ERROR);
		}
	}
	@RequestMapping(path = Mappings.DELETE_PRODUCT, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>deleteProduct(@PathVariable Long companyId, @RequestParam List<Integer>productIds) {
		try {
			for(Integer productId : productIds) {
				Products products = productService.getProductById(companyId, productId);
				if(products != null) {
					products.setStatus(Constant.STATUS.DELETED_STATUS.getValue());
					productService.update(products);
					List<ProductCategories> productCategories= productCategoryService.getProductCategoryByProductId(productId);
					for(ProductCategories result : productCategories) {
						productCategoryService.delete(result);
					}
				}
			}
		return responseUtil.successResponse("Product Deleted Successfully");
		}
	catch (Exception ex) {
		throw new ApplicationException(RestStatus.DELETE_PRODUCT_ERROR);
	}
	
	}
	@RequestMapping(path = Mappings.GET_PRODUCT_BY_CATEGORY_ID, method = RequestMethod.GET, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>getProductByCategoryId(@PathVariable Long companyId, @RequestParam Long categoryId) {
		List<Products> products = productService.getProductByCompanyIdAndCategoryId(companyId, categoryId);
		return responseUtil.successResponse(products);
		
	}

	@RequestMapping(path = Mappings.GET_PRODUCT_LIST_BY_ID, method = RequestMethod.POST, produces = Mappings.CHARSET)
	public ResponseEntity<RestResponse>getProductListById(@PathVariable Long companyId, @RequestParam List<Integer> productIds){
				if(productIds !=null && !productIds.isEmpty()) {
					List<Products> products = (List<Products>) productService.getProductById(companyId, productIds);
					if(products != null) {
						return responseUtil.successResponse(products);
					}
					else {
						throw new ApplicationException(RestStatus.INVALID_PARAMETER);
					}
				}
				else {
					throw new ApplicationException(RestStatus.INVALID_PARAMETER);
				}
	}
	

}
