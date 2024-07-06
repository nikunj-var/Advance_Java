package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.entities.Customer;
import com.cetpa.service.CustomerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {
	@Autowired private CustomerService customerService;
	
	@RequestMapping("customer-management")
	public String getHomeView(HttpSession session) {
		if(session.getAttribute("user")==null)
			return "login";
		
		return "home";
	}
	
	@RequestMapping("customer-management/login/validate")
	public String validatelogin(String uid,String pass,HttpSession session,Model model) {
		System.out.println(uid+pass);
		if(uid.equals("admin")) {
			if(pass.equals("cetpa")) {
				session.setAttribute("user", "admin");
				return "home";
			}
			else {
				model.addAttribute("msg","Entered password is wrong");
			}
		}
		else {
			model.addAttribute("msg","Entered user id does not wrong");
		}
		return "login";
		
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
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
	public String getCustomerList(Model model,int pn) {
		Page<Customer> list = customerService.getList(pn);
		List<Customer> customerList=list.toList();
		model.addAttribute("clist",customerList);
		model.addAttribute("pn",pn);
		model.addAttribute("tp",list.getTotalPages());
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
