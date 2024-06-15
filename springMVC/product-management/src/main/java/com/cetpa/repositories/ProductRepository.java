package com.cetpa.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cetpa.models.Product;

// it uses connection and holds data
@Repository
public class ProductRepository {
	public ProductRepository(){
		 System.out.println("product repository called");
	}

	private ArrayList<Product> productList = new ArrayList<Product>();

	 public void saveProduct(Product product) {
		 System.out.println("product"+product);
		productList.add(product);	
		System.out.println("product added");
	}

	public ArrayList<Product> getList() {
		return productList;
		
	}

}
