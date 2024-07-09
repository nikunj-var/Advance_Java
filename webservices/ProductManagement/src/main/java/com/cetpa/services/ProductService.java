package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entities.Product;
import com.cetpa.repository.ProductRepository;

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
	public List<Product> getListByName(String name){
		return productRepository.findByName(name);
	}

	public List<Product> getListByNameAndBrand(String name,String brand) {
		return productRepository.findByNameAndBrand(name,brand);
		
	}
	
}
