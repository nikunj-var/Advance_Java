package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Product;
import com.employee.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired private ProductRepository productRepository;

	public void saveRecord(Product product) {
		productRepository.save(product);
	}

	public List<Product> getProductList() {
		
		return productRepository.list();
	}
	
	
}
