package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/")
	public String getLoginView() {
		return "product.jsp";
	}
	
	@RequestMapping("save")
	public String saveProduct(Product product,Model model){
		model.addAttribute("product",product);
		return "show.jsp";
	}
}
