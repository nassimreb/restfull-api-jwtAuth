package com.rebouhna.security.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rebouhna.entity.User;
import com.rebouhna.security.UserService;
import com.rebouhna.security.user.repository.UserRepository;

@Service
public class DatabaseUserService implements UserService{
    private final UserRepository userRepository;
    
    @Autowired
    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserRepository getUserRepository() {
        return userRepository;
    }
	
    @Override
	public Optional<User> getByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}

}
