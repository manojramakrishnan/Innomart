package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.Address;
import com.innovationstack.innomart.repositories.AddressRepository;

@Component("addressDAO")
public class AddressDAO {

	@Autowired 
	private AddressRepository addressRepository;
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}
	public Address getAddressDetails(int userId) {
		// TODO Auto-generated method stub
		return addressRepository.getAddressForUserId(userId);
	}
	public Address getAddressByUserId(String userId) {
		// TODO Auto-generated method stub
		return addressRepository.getAddressByUserId(userId);
	}

}
