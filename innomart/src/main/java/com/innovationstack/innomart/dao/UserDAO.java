package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Users;
import com.innovationstack.innomart.repositories.UserRepository;

@Component("userDAO")
public class UserDAO {
	
	
	@Autowired
	private UserRepository userRepository;
	
	public Users findByUserIdAndCompanyIdAndStatus(int userId, Long companyId, int status) {
		System.err.println("details :::: "+userId+ " "+companyId+ " "+status);
		return userRepository.findByUserIdAndCompanyIdAndStatus(userId,companyId,status);
		
	}
	
	public Users findByEmailAndCompanyIdAndStatus(String email, Long companyId, int status) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailAndCompanyIdAndStatus(email,companyId,status);
	}

	public Users registerUser(Users signUp) {
		// TODO Auto-generated method stub
		return userRepository.save(signUp);
		
	}

	public Users findAllUsers( Long companyId) {
		// TODO Auto-generated method stub
		return userRepository.findAllByCompanyId(companyId);
	}

}
