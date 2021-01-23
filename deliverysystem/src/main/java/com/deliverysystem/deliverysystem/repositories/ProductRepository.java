package com.deliverysystem.deliverysystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverysystem.deliverysystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();
}
