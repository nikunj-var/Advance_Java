package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@GetMapping
	public ResponseEntity<Product> getResource(){
		Product product = new Product(101,"Laptop","Apple",123);
		 product = new Product(102,"Laptop","Apple",123);
		ResponseEntity<Product> response = new ResponseEntity<Product>(product,HttpStatus.OK);
		return response;
	}
	@GetMapping("details")
	public ResponseEntity<Product> getDetails(){
		Product product = new Product(102,"Laptop","Apple",123);
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
}
