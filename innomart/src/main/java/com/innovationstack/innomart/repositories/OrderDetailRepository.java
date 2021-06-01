package com.innovationstack.innomart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovationstack.innomart.model.OrderDetail;

@Repository("orderDetailRepository")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
