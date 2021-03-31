package com.example.TaskManager.controllers;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;

@Controller
public class TaskController {
	
	

	@GetMapping(value="/")
    public String showIndexPage() {   
		 return "index";
    }
	
	@GetMapping(value="/task")
    public String showTaskPage() {   

		return "taskform";
	}
	
	@RequestMapping("/new")
	public String showNewTaskPage(Model model) {
		Task task = new Task("", new Date(0, 0, 0),new Date(0, 0, 0),"","",new User());
		model.addAttribute("task",task);
		return "addTask";
	}

}
