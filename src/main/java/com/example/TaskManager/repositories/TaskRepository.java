package com.example.TaskManager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;

public interface TaskRepository extends CrudRepository<Task, Integer> {

    public Task findByName(String name);
    
    public List<Task> findAllByUser(User user);
}