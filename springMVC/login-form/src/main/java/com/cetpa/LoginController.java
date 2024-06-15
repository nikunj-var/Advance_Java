package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String getLoginView() {
		return "login.jsp";
	}
	
	@RequestMapping("home")
	public String getHomePage(String uid,String pass,Model model){
		model.addAttribute("uid",uid);
		if(uid.equals("admin") && pass.equals("cetpa")) {
			return "home.jsp";
		}
		model.addAttribute("msg","Authentication failed...");
		
		return "login.jsp";
	}
}
