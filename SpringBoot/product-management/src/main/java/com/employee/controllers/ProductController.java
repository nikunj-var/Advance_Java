package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.model.Product;
import com.employee.services.ProductService;

@Controller
@RequestMapping("product-management")
public class ProductController {
	
	@Autowired private ProductService productService;
	
	@RequestMapping("")
	public String getHomeView() {
		return "index";
	}
	@RequestMapping("insert")
	public String getInsertView() {
		return "insert";
	}
	@RequestMapping("save-record")
	public String SaveProductRecord(Product product) {
		productService.saveRecord(product);
		return "save-record";
	}
	  @GetMapping("list")
	public String showList(Model model) {
		List<Product> productList = productService.getProductList();
		model.addAttribute("plist",productList);
		return "show-list";
	}
}
