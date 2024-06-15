package com.cetpa.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.models.Product;
import com.cetpa.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService; //dependency injection
	
	@RequestMapping("/")
	public String getHomeView() {
		return "index.jsp";
	}
	
	@RequestMapping("insert")
	public String getInsertView() {
		return "insert.jsp";
	}
	
	@RequestMapping("save-record")
	public String saveProductRecord(Product product) {
		System.out.println("save record called controller");
		productService.addProduct(product);
		return "save-record.jsp";
	}
	
	@RequestMapping("show-list")
	public String getProductRecord(Model model) {
		List<Product> productList = productService.getList();
		System.out.println(productList);
		model.addAttribute("list",productList);
		return "show-list.jsp";
	}
}
