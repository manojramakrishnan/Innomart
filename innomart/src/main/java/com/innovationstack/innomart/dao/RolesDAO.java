package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Roles;
import com.innovationstack.innomart.repositories.RolesRepository;

@Component("rolesDAO")
public class RolesDAO {
	
	@Autowired
	private RolesRepository rolesRepository;

	public Roles findById(Integer id) {
		// TODO Auto-generated method stub
		return rolesRepository.findByRoleId(id);
	}

}
