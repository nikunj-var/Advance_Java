package com.cetpa.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.entites.*;
import com.cetpa.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String getEmployeeDashboardView(Model model) {
		List<Employee> employeelist = employeeService.getList();
		model.addAttribute("elist",employeelist);
		return "employeeDashboard";
	}
}
