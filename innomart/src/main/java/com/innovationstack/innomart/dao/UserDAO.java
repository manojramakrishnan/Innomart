package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.repositories.UserRepository;

@Component("userDAO")
public class UserDAO {
	
	
	@Autowired
	private UserRepository userRepository;
	
	public Users findByEmailAndCompanyIdAndStatus(String email, Long companyId, int status) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailAndCompanyIdAndStatus(email,companyId,status);
	}

	public Users registerUser(Users signUp) {
		// TODO Auto-generated method stub
		return userRepository.save(signUp);
		
	}

}
