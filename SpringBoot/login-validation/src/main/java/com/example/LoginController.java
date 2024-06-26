package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {
	@RequestMapping("")
	public String getLoginView() {
		return "login";
	}
	@RequestMapping("validate")
	public String validateUser(String uid,String pass,Model model) {
		if(uid.equals("admin") && pass.equals("cetpa"))
			return "home";
		model.addAttribute("msg","User id or password is incorrect");
		model.addAttribute("userid",uid);
		return "login";
	}
}
