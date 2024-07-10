package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Department;
import com.cetpa.entity.Employee;
import com.cetpa.service.DepartmentService;
import com.cetpa.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	
	@RequestMapping(value="create",method= RequestMethod.POST)
	public ResponseEntity<Employee> createResource(@RequestBody Employee employee){
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	};
	
	@GetMapping("list/by-dept-name")
	public ResponseEntity<List<Employee>> getListByDepartmentName(@RequestParam("name") String name){
		List<Employee> empList = employeeService.getListByDeptName(name);
		return ResponseEntity.status(HttpStatus.OK).body(empList);
	}
}
