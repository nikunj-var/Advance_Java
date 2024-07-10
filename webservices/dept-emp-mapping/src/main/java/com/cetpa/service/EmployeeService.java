package com.cetpa.service;

import java.util.List;

import com.cetpa.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getListByDeptName(String name);

	
}
