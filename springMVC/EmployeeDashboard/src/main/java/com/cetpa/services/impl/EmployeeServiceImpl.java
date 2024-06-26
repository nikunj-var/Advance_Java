package com.cetpa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entites.Employee;
import com.cetpa.repositories.EmployeeRepository;
import com.cetpa.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getList() {
		return employeeRepository.getEmployeeList();
	}
	
	
	
}
