package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Users;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Integer> {
	Users findByEmailAndCompanyIdAndStatus(String email, Long companyId, int status);
}
