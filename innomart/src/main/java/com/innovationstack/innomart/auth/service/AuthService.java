package com.innovationstack.innomart.auth.service;

import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.model.UsersTokens;

public interface AuthService {
	
	public UsersTokens getUserTokenById (String token);
	
	public UsersTokens createUserToken(Users adminUser, boolean keepMeLogin);

}
