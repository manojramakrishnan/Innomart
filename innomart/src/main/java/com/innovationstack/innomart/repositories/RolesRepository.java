package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Roles;

@Repository("rolesRepository")
public interface RolesRepository extends JpaRepository<Roles, Integer> {

	@Query("SELECT r FROM Roles r WHERE r.id = :id")
	Roles retrieveRoleData(int id);
}
