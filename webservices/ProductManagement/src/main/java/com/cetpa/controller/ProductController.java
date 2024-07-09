package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entities.Product;
import com.cetpa.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired private ProductService productService;
	
	@PostMapping("save")
	public ResponseEntity<Product> createResource(@RequestBody Product product){
		  System.out.println("Received product: " + product);
		productService.saveProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	
	}

	@GetMapping("list")
	public ResponseEntity<List<Product>> getResource(){
		List<Product> list = productService.getProductList();
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("details/{pid}")
	public ResponseEntity<Product> getResourceDetails(@PathVariable("pid") int pid){
		Product product = productService.getProduct(pid);
		if(product == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	
	@GetMapping("details1")
	public ResponseEntity<Product> getResourceDetails1(@RequestParam("pid") int pid){
		Product product = productService.getProduct(pid);
		if(product == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}

	@GetMapping("list/byname")
	public ResponseEntity<List<Product>> getResourceListByName(@RequestParam("name") String name){
		List<Product> product = productService.getListByName(name);
		if(product.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(product);
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	@GetMapping("list/byname-and-brand")
	public ResponseEntity<List<Product>> getResourceListByNameAndBrand(@RequestParam("name") String name,@RequestParam("brand") String brand){
		List<Product> product = productService.getListByNameAndBrand(name,brand);
		if(product.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(product);
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
}
