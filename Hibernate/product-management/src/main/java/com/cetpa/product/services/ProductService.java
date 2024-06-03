package com.cetpa.product.services;


import java.util.List;
import java.util.Scanner;

import com.cetpa.product.entities.Product;
import com.cetpa.product.repositories.ProductRepository;

public class ProductService {
	Scanner sc = new Scanner(System.in);
	
	private ProductRepository productRepository = new ProductRepository();
	
	public void saveProduct() {
		 System.out.println("......");
	     System.out.println("Enter product Id");
	     int pid = Integer.parseInt(sc.nextLine());
	     System.out.println("Enter product Name");
	     String name =sc.nextLine();
	     System.out.println("Enter product Quantity");
	     int quantity = Integer.parseInt(sc.nextLine());
	     System.out.println("Enter product Price");
	     int price = Integer.parseInt(sc.nextLine());
	     Product product = new Product(pid,name,quantity,price);
	     productRepository.saveRecord(product);
	     System.out.println("......");
	}

	public void getProduct() {
		 System.out.println("......");
	     System.out.println("Enter product Id");
	     int pid = Integer.parseInt(sc.nextLine());
	     Product product = productRepository.getRecord(pid);
	     System.out.println("Product Id:"+product.getpId());
	     System.out.println("Product Name:"+product.getpName());
	     System.out.println("Product Quantity:"+product.getQuantity());
	     System.out.println("Product Price:"+product.getPrice());
	}

	public void deleteProduct() {
		 System.out.println("......");
	     System.out.println("Enter product Id");
	     int pid = Integer.parseInt(sc.nextLine());
	     Product product = productRepository.getRecord(pid);
	     productRepository.deleteRecord(product);
	     System.out.println("Product record deleted");
	}

	public void showProduct() {
		List<Product> productList = productRepository.getRecordList();
		for(Product product : productList) {
			System.out.println(product.toString());
		}
		
	}

}
