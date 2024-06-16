package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.Product;
import com.cetpa.repositories.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	 
	public void addProduct(Product product) {
		System.out.println("add product service called");
		productRepository.saveProduct(product);
	}

	public List<Product> getList() {
		return productRepository.getList();
	}

	public Product getProduct(int id) {
		return productRepository.getProduct(id);
	}

	public void deleterecord(int id) {
		Product product = productRepository.getProduct(id);
		productRepository.deleteRecord(product);
		
	}
	
}
