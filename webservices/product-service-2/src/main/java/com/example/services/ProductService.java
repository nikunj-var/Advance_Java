package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService  {
	@Autowired private ProductRepository productRepository;

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public List<Product> getProductList() {
		return productRepository.findAll();
	}

	public Product getProduct(int pid) {
		return productRepository.findById(pid).orElse(null);
	}
	
}
