package com.cetpa.product.entities;

public class Product {
	private int pId;
	private String pName;
	private int quantity;
	private int price;
	Product(){
		
	}
	public Product(int pId, String pName, int quantity, int price) {
		this.pId = pId;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
