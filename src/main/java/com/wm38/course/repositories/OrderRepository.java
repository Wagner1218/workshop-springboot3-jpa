package com.wm38.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wm38.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
