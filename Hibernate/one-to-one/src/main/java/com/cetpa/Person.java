package com.cetpa;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	private String place;
	private int age;
	Person(){
		
	}
	public Person(int pid, String name, String place, int age) {
		this.pid = pid;
		this.name = name;
		this.place = place;
		this.age = age;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", place=" + place + ", age=" + age + "]";
	}
	
}
