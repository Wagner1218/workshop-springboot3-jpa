package com.wm38.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wm38.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
