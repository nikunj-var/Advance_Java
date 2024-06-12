package com.cetpa;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class democontroller {

//	these methods are called by front controller
//	to call these objects front controller must have this class reference
//	so to create a object IOC creates the object we write @Controller
//	by writing the annotation ioc created the object and front controller will get the class object reference
//	ioc gives this class reference to the front controller
	
	
	@RequestMapping("/m1")
	public String method1() {
		System.out.println("Method1 called");
//		this return is treated as a page
		return "cetpa.jsp";
	}
	
	@RequestMapping("/m2")
	public String method2() {
		System.out.println("Method2 called");
		return "noida.jsp";
	}
}
