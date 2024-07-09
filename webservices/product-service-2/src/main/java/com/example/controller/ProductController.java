package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Product;
import com.example.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired private ProductService productService;
	
	@PostMapping("save")
	public ResponseEntity<Product> createResource(@RequestBody Product product){
		productService.saveProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	
	}

	@GetMapping("list")
	public ResponseEntity<List<Product>> getResource(){
		List<Product> list = productService.getProductList();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("details/{pid}")
	public ResponseEntity<Product> getResourceDetails(@PathVariable("pid") int pid){
		Product product = productService.getProduct(pid);
		if(product == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(product);
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
}
