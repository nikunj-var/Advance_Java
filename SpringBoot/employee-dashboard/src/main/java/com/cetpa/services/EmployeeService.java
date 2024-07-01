package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	private com.cetpa.repositories.EmployeeRepository employeeRepository;

	public void saveRecord(Employee employee) 
	{
		employeeRepository.save(employee);
	}

	public List<Employee> getList() 
	{
		return employeeRepository.findAll();
	}
	public Employee getRecord(int eid) 
	{
		return employeeRepository.findById(eid).orElse(null);
	}

	public void deleteRecord(int eid) 
	{
		employeeRepository.deleteById(eid);
	}

	public void updateRecord(Employee employeen) 
	{
		Employee employeeo=employeeRepository.save(employeen);
	}
	
}
