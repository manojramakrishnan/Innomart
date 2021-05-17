package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.UsersTokens;

@Repository("userTokenRepository")
public interface UserTokenRepository extends JpaRepository<UsersTokens, String>{

	@Query("SELECT u FROM UsersTokens u WHERE  u.token = :tokenId" )
	UsersTokens findByTokenId(String tokenId);

}
