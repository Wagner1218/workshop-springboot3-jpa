package com.wm38.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm38.course.entities.Category;
import com.wm38.course.services.CategorySerice;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	//Informa que o CategoryResource depende do CategorySerice
	@Autowired
	private CategorySerice service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	
	}
	
	
}
