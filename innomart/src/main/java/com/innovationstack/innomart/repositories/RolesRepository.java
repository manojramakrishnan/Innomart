package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Roles;

@Repository("rolesRepository")
public interface RolesRepository extends JpaRepository <Roles, Integer> {

	Roles findByRoleId(int id);
}
