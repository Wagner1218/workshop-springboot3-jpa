package com.wm38.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wm38.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
