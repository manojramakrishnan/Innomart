package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.dao.OrderDetailDAO;
import com.innovationstack.innomart.model.OrderDetail;

@Service("orderDetailService")
public class OrderDetailService {
	
	@Autowired
	private OrderDetailDAO orderDetailDAO;

	public OrderDetail saveOrUpdate(OrderDetail orderDetail) {
		return orderDetailDAO.save(orderDetail);
		
	}

}
