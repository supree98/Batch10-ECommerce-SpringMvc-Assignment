package com.te.amazonwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligation {

	@GetMapping("/redirect")
	public String redirectDemo() {
		return "redirect:https://youtube.com";
	}
	
	@GetMapping("/forward")
	public String forwardDemo(ModelMap map) {
		map.addAttribute("message", "you are forwarded");
		return "forward:login";
	}
}
