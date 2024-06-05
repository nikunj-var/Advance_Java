package com.cetpa.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "product12")
public class ProductEntity 
{
	@Id
	public int pid;
	@Column(name="username",unique=true,nullable=false)
	public String name;
	public String brand;
	public int price;
	public ProductEntity(){
		
	}
	public ProductEntity(int pid, String name, String brand, int price) {
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
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
