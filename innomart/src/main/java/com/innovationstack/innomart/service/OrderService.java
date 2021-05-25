package com.innovationstack.innomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationstack.innomart.api.request.model.OrderRM;
import com.innovationstack.innomart.dao.OrderDAO;
import com.innovationstack.innomart.model.Orders;

@Service("orderService")
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;

	
		
	

	public Orders save(Orders orders) {
		Orders newOrders=orderDAO.saveOrder(orders);
		return newOrders;
		// TODO Auto-generated method stub
		
	}
}
