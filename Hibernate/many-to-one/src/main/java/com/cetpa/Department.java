package com.cetpa;

import javax.persistence.*;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	private String name;
	private String head;
	public Department() {
		
	}
	public Department( String name, String head) {
		super();
		this.name = name;
		this.head = head;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	

}
