package com.deliverysystem.deliverysystem.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deliverysystem.deliverysystem.dto.OrderDTO;
import com.deliverysystem.deliverysystem.entities.Order;
import com.deliverysystem.deliverysystem.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		// List<Product> list = repository.findAll();
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
