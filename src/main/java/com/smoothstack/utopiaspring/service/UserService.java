package com.smoothstack.utopiaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaspring.model.User;
import com.smoothstack.utopiaspring.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepo;
	@Autowired
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}

	public void save(User user) {
		userRepo.save(user);
		
	}

}
