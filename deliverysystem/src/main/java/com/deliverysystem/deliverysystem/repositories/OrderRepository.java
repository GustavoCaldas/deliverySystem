package com.deliverysystem.deliverysystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverysystem.deliverysystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
