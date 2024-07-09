package com.example.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	@Generated(value = { "product_seq" })
	@SequenceGenerator(name="product_seq",initialValue=1,allocationSize=1)
	private int pid;
	private String name;
	private String brand;
	private int price;
	public Product(){
		
	}
	public Product(int pid, String name, String brand, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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