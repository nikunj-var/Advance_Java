package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.entities.Customer;
import com.cetpa.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired private CustomerService customerService;
	
	@RequestMapping("customer-management")
	public String getHomeView() {
		return "home";
	}
	
	@RequestMapping("customer-management/add")
	public String addCustomer() {
		return "add-customer";
	}
	@RequestMapping("customer-management/save-record")
	public String saveRecord(Customer customer) {
		customerService.saveRecord(customer);
		return "save";
	}
	@RequestMapping("customer-management/list")
	public String getCustomerList(Model model) {
		List<Customer> customerList = customerService.getList();
		model.addAttribute("clist",customerList);
		return "customer-list";
	}
	@RequestMapping("customer-management/delete-record")
	public String deleteCustomer(int cid) {
		customerService.deleteRecord(cid);
		return "redirect:list";
	}
	@RequestMapping("customer-management/search")
	public String searchCustomer() {
	
		return "search-customer";
	}
	@RequestMapping("customer-management/search-record")
	public String searchCustomerRecord(int cid,Model model) {
		Customer customer = customerService.getCustomer(cid);
		if(customer == null) {
			model.addAttribute("msg","customer record not found");
			model.addAttribute("cid",cid);
			return "search-customer"; 
		}
		model.addAttribute("customer",customer);
		return "show-customer";
	}
}
