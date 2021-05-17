package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.UsersTokens;
import com.innovationstack.innomart.repositories.UserTokenRepository;

@Component("userTokenDAO")
public class UserTokenDAO {

	@Autowired
	private UserTokenRepository userTokenRepository;
	
	
	public UsersTokens findByTokenID(String tokenId) {
		// TODO Auto-generated method stub
		return  userTokenRepository.findByTokenId(tokenId);
	
	}


	public void invalidateToken(UsersTokens usersTokens) {
		// TODO Auto-generated method stub
		 userTokenRepository.delete(usersTokens);
	}

}
