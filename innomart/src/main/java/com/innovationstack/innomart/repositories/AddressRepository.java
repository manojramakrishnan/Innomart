package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address,Integer> {
	
	@Query("SELECT a FROM Address a where a.userId= :userId")
	Address getAddressForUserId(int userId);
	
	@Query("SELECT a FROM Address a where a.userId= :userId")
	Address getAddressByUserId(String userId);



	

}
