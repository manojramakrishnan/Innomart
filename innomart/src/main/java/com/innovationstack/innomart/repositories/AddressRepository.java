package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address,Integer> {
	

}
