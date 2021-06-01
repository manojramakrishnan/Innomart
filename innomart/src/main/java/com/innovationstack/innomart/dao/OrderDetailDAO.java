package com.innovationstack.innomart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.model.OrderDetail;
import com.innovationstack.innomart.repositories.OrderDetailRepository;

@Component("orderDetailDAO")
public class OrderDetailDAO {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;

	public OrderDetail save(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return orderDetailRepository.save(orderDetail);
	}

}
