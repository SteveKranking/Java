package com.project.LoginReg.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.LoginReg.models.User;
import com.project.LoginReg.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private BCryptPasswordEncoder bcrypt;
	// Member variables / service initializations go here
		
	public UserService(UserRepository userRepository){
		this.userRepository=userRepository;
		this.bcrypt=new BCryptPasswordEncoder();
	}

	public void create(User user) {
		userRepository.save(user);
	}

	public ArrayList<User> all() {
		return (ArrayList<User>)userRepository.findAll();
	}

	public void update(User user) {
		create(user);
	}

	public User findById(long id) {
		return (User) userRepository.findOne(id);
	}

	public void destroy(User user) {
		userRepository.delete(user);
	}


	
	// Crud methods to act on services go here.
}
