package com.cetpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Department;
import com.cetpa.entity.Employee;
import com.cetpa.repository.DepartmentRepository;
import com.cetpa.repository.EmployeeRepository;
import com.cetpa.service.DepartmentService;
import com.cetpa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired private EmployeeRepository employeeRepository;
	@Autowired private DepartmentRepository departmentRepository;
	
	public Employee saveEmployee(Employee employee) {
		departmentRepository.updateTotalEmployees(employee.getDepartment().getDid());
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	
	public List<Employee> getListByDeptName(String name) {
		return employeeRepository.getEmployeeListByDeptName(name);
	}

	

	
}
