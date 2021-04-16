package com.example.TaskManager.services;

import java.text.MessageFormat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.UserRepository;

@Service
public class UserService{
	@Autowired
	private UserRepository userRepository;

	public User findUser(String email)
	{
		return userRepository.findByEmail(email);
	}
	
	public void registerUser(User user) {
		
		String password = user.getPassword();

		user.setPassword(password);

		final User createdUser = userRepository.save(user);
	}
	
	
}
