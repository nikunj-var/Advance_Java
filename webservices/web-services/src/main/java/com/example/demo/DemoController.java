package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@GetMapping("list")
	public String getMethod() {
		return "GET API called....";
	}
	
	@PostMapping
	public String poatMethod() {
		return "POST API called....";
	}
	
	@DeleteMapping
	public String deleteMethod() {
		return "DELETE API called....";
	}
}
