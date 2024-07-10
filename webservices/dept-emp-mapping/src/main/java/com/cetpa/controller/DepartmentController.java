package com.cetpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetpa.entity.Department;
import com.cetpa.service.DepartmentService;

@Controller
@ResponseBody
@RequestMapping("department")
public class DepartmentController {
	
	@Autowired private DepartmentService departmentService;
	
	@RequestMapping(value="create",method= RequestMethod.POST)
	public ResponseEntity<Department> createResource(@RequestBody Department department){
		departmentService.saveDepartment(department);
		return ResponseEntity.status(HttpStatus.CREATED).body(department);
	};
	
}
