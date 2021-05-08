package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.UserDAO;
import com.innovationstack.innomart.model.Users;

@Service("userService")
public class UserService {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	private UserDAO userDAO;
	
	public UserService(@Qualifier("userDAO") UserDAO userDAO,
			BCryptPasswordEncoder bCryptPasswordEncoder	) {
		this.userDAO=userDAO;
		this.bCryptPasswordEncoder=bCryptPasswordEncoder;
		
	}
	public Users getUserByEmail(String email, Long companyId, int status) {
		// TODO Auto-generated method stub
		return userDAO.findByEmailAndCompanyIdAndStatus(email,companyId,status) ;
	
	}
	public void save(Users signUp) {
		signUp.setPasswordHash(bCryptPasswordEncoder.encode(signUp.getPasswordHash()));
		userDAO.registerUser(signUp);
		
	}
	
	
	
}
