package com.cetpa;

public class Employee {
	private int eid;
	private String name;
	private String department;
	private int salary;
	public Employee() {
		
	}
	public Employee(int eid, String name, String department, int salary) {
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
