package com.wm38.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wm38.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
