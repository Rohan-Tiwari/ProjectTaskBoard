package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.ProjectTask;
import com.app.domain.User;
import com.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveorUpdateUser(User user) {
		return userRepository.save(user);
	}
	
	public Iterable<User> findAllUser(){
    	return userRepository.findAll();
    }
    
}
