package com.innovationstack.innomart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.api.request.model.OrderRM;
import com.innovationstack.innomart.model.Orders;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Orders , Integer>{

	@Query("SELECT o FROM Orders o WHERE  o.id = :companyId")
	List<Orders> getOrderByCompanyId(Integer companyId);



}
