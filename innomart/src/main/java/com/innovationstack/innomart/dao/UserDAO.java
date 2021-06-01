package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	

	public Users findByUserIdAndCompanyIdAndStatus(String userId, Long companyId, int status) {
		// TODO Auto-generated method stub
		return userRepository.findByUserIdAndCompanyIdAndStatus(userId, companyId, status);
	}

	public Users findBYCompanyIdAndStatus(Long companyId, int status) {
		// TODO Auto-generated method stub
		return userRepository.findByCompanyIdAndStatus( companyId, status);
	}

	public List<Users> findUsers(Long companyId) {
		// TODO Auto-generated method stub
		return userRepository.findUsers(companyId);
	}

	

}
