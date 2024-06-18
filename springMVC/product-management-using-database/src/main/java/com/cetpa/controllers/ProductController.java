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
		
		productService.addProduct(product);
		return "save-record.jsp";
	}
	
	@RequestMapping("show-list")
	public String getProductRecord(Model model) {
		List<Product> productList = productService.getList();
		model.addAttribute("list",productList);
		return "show-list.jsp";
	}
	
	@RequestMapping("search")
	public String getSearchView() {
		return "search.jsp";
	}
	
	@RequestMapping("search-record")
	public String getRecord(int id,Model model){
		Product product = productService.getProduct(id);
		if(product == null) {
			model.addAttribute("msg","Product not exist");
			return "search.jsp";
		}
		model.addAttribute("product",product);
		return "search-record.jsp";
	}
	
	@RequestMapping("delete-record")
	public String getDeleteView() {
		return "delete-record.jsp";	
	}
	@RequestMapping("delete")
	public String Recorddeleted(int id)
	{	
		productService.deleterecord(id);
		return "delete.jsp";
	}
}
