package com.innovationstack.innomart.service;

import javax.transaction.Transactional;

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
	@Autowired
	private UserAddressService userAddressService;
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
	@Transactional
	public Users save(Users signUp) {
		signUp.setPasswordHash(bCryptPasswordEncoder.encode(signUp.getPasswordHash()));
		Users userAdd= userDAO.registerUser(signUp);
		userAdd.getAddress().setUserId(userAdd.getId());
		userAddressService.save(userAdd.getAddress());
		return userAdd;
	}
	public Users doFilterSearchSortPagingUser(Long companyId) {
		// TODO Auto-generated method stub
		return userDAO.findAllUsers(companyId);
		
	}
	
	
	
}
