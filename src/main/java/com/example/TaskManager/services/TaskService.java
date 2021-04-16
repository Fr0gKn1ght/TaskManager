package com.example.TaskManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> GetAllTasks() {
	
		return taskRepository.findAll();
	}
	
	public Task getTask(String name)
	{
		return taskRepository.findByName(name);
	}

	public List<Task> GetTasksByUser(User user) {
		return(taskRepository.findAllByUser(user));
	}
}
