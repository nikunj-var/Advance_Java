package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
//	http://localhost:8080/sayhello/hello
	@RequestMapping("hello")
	public String getInputView() {
		return "input.jsp";
	}
	
//	http://localhost:8080/sayhello/sayhello
	@RequestMapping("sayhello")
	public String getOutputView(String str,Model model) {
		model.addAttribute("name",str);
		return "output.jsp";
	}
	
}
