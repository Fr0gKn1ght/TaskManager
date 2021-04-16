package com.example.TaskManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.User;
import com.example.TaskManager.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/login")
    public String showLoginPage() {   
		 return "loginform";
    }
	
	@GetMapping(value="/register")
    public String showRegisterPage() {   

		return "registerform";
	}
	
	@PostMapping
	(value="/login")
	public String login(ModelMap model,@RequestParam String email, @RequestParam String password) {
		User u = userService.findUser(email);
		if(u==null)
		{
			model.put("errorMessage", "User Not Found");
			return "loginform";
		}
		if(!u.getPassword().equals(password))
		{
			model.put("errorMessage", "Password Was Incorrect");
			return "loginform";
		}
		else
			return "task";
	}

}
