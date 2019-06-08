package com.example.springboot.web.springbootmyfirstapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping("/nuevoLogin")
	
	public String messageLogin () {
		
		
		
		return "login";
		
		
	}

}
