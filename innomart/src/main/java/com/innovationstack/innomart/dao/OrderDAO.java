package com.innovationstack.innomart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationstack.innomart.api.request.model.OrderRM;
import com.innovationstack.innomart.model.Orders;
import com.innovationstack.innomart.repositories.OrderRepository;

@Component("orderDAO")
public class OrderDAO {

	@Autowired
	private OrderRepository orderRepository;


		public Orders saveOrder(Orders orders) {
		// TODO Auto-generated method stub
		return orderRepository.save(orders);
	}


		public List<Orders> getOrderByCompanyId(Long companyId) {
			// TODO Auto-generated method stub
			String companyIds= companyId.toString();
			return orderRepository.getOrderByCompanyId(Integer.parseInt(companyIds));
		}
}
