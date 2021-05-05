package com.te.amazonwebapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/cookies")
public class CookieController {

	@GetMapping("/cookiepage")
	public String getCookiePage() {
		return "cookie";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(ModelMap map,HttpServletResponse response) {
		Cookie cookie = new Cookie("technoelevate", "batch10");
		response.addCookie(cookie);
		map.addAttribute("message", "cookie created successfully");
		return "cookie";  
	}
	
	@GetMapping("/showCookie")
	public String getCookie(@CookieValue(name = "technoelevate", required = false) String value,
			ModelMap map) {
		if(value != null) {
			map.addAttribute("message", "cookie found");
			map.addAttribute("cookieValue", value);
		}
		return "cookie";
	}
	
	@GetMapping("/deleteCookie")
	public String deletCookie(@CookieValue(name = "technoelevate", required = false) String value,
			ModelMap map, HttpServletRequest request) {
		if(value != null) {
			
			Cookie[] cookie = request.getCookies();
			cookie[0].setMaxAge(0);
			map.addAttribute("message", "cookie deleted");
			
		}
		return "cookie";
	}
	
}
