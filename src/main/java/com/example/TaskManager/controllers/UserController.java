package com.example.TaskManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@GetMapping(value="/login")
    public String showLoginPage() {   

		return "loginform";
	}
	@GetMapping(value="/register")
	public String showRegisterPage() {
	return "registerform";
	}
	
}


