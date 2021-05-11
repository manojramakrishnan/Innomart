package com.innovationstack.innomart.api;

public class Mappings {
	
	public static final String VERSION = "api/v1/{companyId}";
	public static final String Users= VERSION + "/users"; 
    
	public static final String CHARSET = "application/json;charset=utf-8";
	public static final String USER_REGISTER = "/register";
	
	public static final String USER_LIST = "/list";
	public static final String USER_DETAILS = "/detail/{userId}";
	public static final String UPDATE_USER = "/update"; 

}
