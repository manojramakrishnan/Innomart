package com.innovationstack.innomart.service;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.UserDAO;
import com.innovationstack.innomart.dao.UserTokenDAO;
import com.innovationstack.innomart.model.UsersTokens;

@Service("userTokenService")
public class UserTokenService {
	@Autowired
	private  UserTokenDAO userTokenDAO;

	public  UsersTokens getTokenID(String tokenId) {
		// TODO Auto-generated method stub
		return userTokenDAO.findByTokenID(tokenId);
	}

	public void invalidateToken(UsersTokens usersTokens) {
		// TODO Auto-generated method stub
		userTokenDAO.invalidateToken(usersTokens);
	}

}
