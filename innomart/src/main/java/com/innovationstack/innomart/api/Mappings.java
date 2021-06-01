package com.innovationstack.innomart.api;

public class Mappings {
	
	public static final String VERSION = "api/v1/{companyId}";
	public static final String VERSION_COMPANY = "api/v1";
	public static final String VERSION_PRODUCT = "api/v1";
	public static final String Users= VERSION + "/users"; 
	public static final String Admin= VERSION + "/Admin";
	
	public static final String CHARSET = "application/json;charset=utf-8";
	public static final String USER_REGISTER = "/register";
	
	public static final String USER_LIST = "/list";
	public static final String USER_DETAILS = "/detail/{userId}";
	public static final String UPDATE_USER = "/update";
	public static final String DELETE_USER = "/delete";
	public static final String APPROVE_REGISTERED_USERS = "/approve"; 
	
	public static final String USERS_LOGIN = "/login";
	public static final String USERS_LOGOUT = "/logout";
 
	public static final String CHANGE_PASSWORD_USER = "/changePassword";
	
	public static final String Category= VERSION + "/category";
	public static final String ADD_CATEGORY = "/addCategory";
	public static final String GET_CATEGORY = "/getCategory";
	public static final String UPDATE_CATEGORY = "/updateCategory";
	public static final String DELETE_CATEGORY = "/deleteCategory";
	
	public static final String Company= VERSION_COMPANY+ "/company";
	public static final String GET_ALL_COMPANIES = "/allCompanies";
	public static final String GET_COMPANY_BY_ID = "/byId";
	
	public static final String Order= VERSION+ "/order";
	public static final String ADD_ORDER = "/addOrder";
	public static final String GET_ORDER_BY_COMPANY_ID = "/getOrder";

	public static final String Product= VERSION_PRODUCT+ "/product";
	public static final String CREATE_PRODUCT = "/createProduct";
	public static final String COMPANY_ID = "/{companyId}";
	public static final String GET_ALL_PRODUCTS_BY_COMPANY_ID = COMPANY_ID+"/allProducts";
	public static final String GET_PRODUCT_BY_ID = COMPANY_ID+"/getById/{productId}";
	public static final String UPDATE_PRODUCT = COMPANY_ID+"/updateProduct";
	public static final String DELETE_PRODUCT = COMPANY_ID+"/deleteProduct";
	public static final String GET_PRODUCT_BY_CATEGORY_ID = COMPANY_ID+"/byCategoryId";
	public static final String GET_PRODUCT_LIST_BY_ID = COMPANY_ID+"/listById";
	
	
}
