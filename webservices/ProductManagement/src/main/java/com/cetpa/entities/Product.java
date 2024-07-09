package com.cetpa.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(generator = "product_seq")
	@SequenceGenerator(name="product_seq",initialValue=1,allocationSize=1)
	private int pid;
	private String name;
	private String brand;
	private int price;
	public Product(){
		
	}
	public Product(String name, String brand, int price) {
	
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}}