package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.RolesDAO;
import com.innovationstack.innomart.model.Roles;

@Service("rolesService")
public class RolesService {

	@Autowired
	private RolesDAO rolesDAO;
	
	
	
	public Roles findById(Integer id) {
		// TODO Auto-generated method stub
		return rolesDAO.findById(id);
	}

}
