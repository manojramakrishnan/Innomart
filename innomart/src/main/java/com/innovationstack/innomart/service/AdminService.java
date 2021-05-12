package com.innovationstack.innomart.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.innovationstack.innomart.model.Users;

@Service ("adminService")
public class AdminService {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Transactional
	 public void approve(Users existingUser) {
	  Users approveExistingUsers=entityManager.find(Users.class, existingUser.getId());
	  approveExistingUsers.setStatus(existingUser.getStatus());
	  
	  entityManager.merge(approveExistingUsers);
	}


	
	



}