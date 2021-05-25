package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.AddressDAO;
import com.innovationstack.innomart.model.Address;

@Service("userAddressService")
public class UserAddressService {

	@Autowired
	private AddressDAO addressDAO ;
	public void save(Address address) {
		// TODO Auto-generated method stub
		addressDAO.saveAddress(address);
		
	}
	public Address getAddressByUserIdAndStatus(int userId) {
		// TODO Auto-generated method stub
		return addressDAO.getAddressDetails(userId);
	}
	public Address getAddressByUserId(String userId) {
		// TODO Auto-generated method stub
		return addressDAO.getAddressByUserId(userId);
	}
	
	

}
