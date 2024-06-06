package com.cetpa;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(generator="emp_seq")
	@SequenceGenerator(name="emp_seq",initialValue=101,allocationSize=1)
	private int eid;
	private int salary;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	public Employee() {
		
	}
	public Employee(String name,int salary, Department department) {
		super();
		this.salary = salary;
		this.name = name;
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

	
}
