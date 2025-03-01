package com.wm38.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wm38.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
