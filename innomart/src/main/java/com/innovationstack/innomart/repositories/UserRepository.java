package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Users;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	@Query("SELECT u FROM Users u WHERE u.email = :email AND u.companyId = :companyId And u.status = :status")
	Users findByEmailAndCompanyIdAndStatus(String email, Long companyId, int status);

	@Query("SELECT u FROM Users u WHERE  u.companyId = :companyId" )
	Users findAllByCompanyId(Long companyId);

	@Query("SELECT u FROM Users u WHERE u.id = :userId AND u.companyId = :companyId And u.status = :status")
	Users findByUserIdAndCompanyIdAndStatus(int userId, Long companyId, int status);

	@Query("SELECT u FROM Users u WHERE u.id = :userId AND u.companyId = :companyId And u.status = :status")
	Users findByUserIdAndCompanyIdAndStatus(String userId, Long companyId, int status);


	@Query("SELECT u FROM Users u WHERE u.companyId = :companyId And u.status = :status")
	Users findByCompanyIdAndStatus(Long companyId, int status);

	
	
}
