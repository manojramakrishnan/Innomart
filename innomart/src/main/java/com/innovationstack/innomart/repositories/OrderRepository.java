package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.api.request.model.OrderRM;
import com.innovationstack.innomart.model.Orders;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Orders , Integer>{



}
