package com.wm38.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm38.course.entities.Product;
import com.wm38.course.services.ProductSerice;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	//Informa que o ProductResource depende do ProductSerice
	@Autowired
	private ProductSerice service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	
		
	}
	
	
}
