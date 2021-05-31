package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Roles;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Roles, Integer> {

	@Query("SELECT u.role from Roles u WHERE u.id= :roleId")
	String findRoleByRoleId(int roleId);
	
	

}
