package com.innovationstack.innomart.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	
	@PersistenceContext
	private EntityManager entityManager;
	
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
	public Users getUserByUserIdAndCompanyIdAndStatus(int userId, Long companyId, int status) {
		// TODO Auto-generated method stub
		System.err.println("userid | companyId | status ::"+userId+" "+companyId+ " "+status);
		return userDAO.findByUserIdAndCompanyIdAndStatus(userId,companyId,status);
	}
	public Users getUserByUserIdAndCompanyIdAndStatus(String userId, Long companyId, int status) {
		// TODO Auto-generated method stub
		return userDAO.findByUserIdAndCompanyIdAndStatus(userId, companyId, status);
	}
	public Users getUserByCompanyIdAndStatus(Long companyId, int status) {
		// TODO Auto-generated method stub
		return userDAO.findBYCompanyIdAndStatus(companyId,status);
	}
	@Transactional
	public void delete(Users existingUser) {
		Users deleteUser=entityManager.find(Users.class, existingUser.getId());
		deleteUser.setStatus(existingUser.getStatus());
		
		entityManager.merge(deleteUser);
		//return deleteUser;
		
	}
	
	
	
}
