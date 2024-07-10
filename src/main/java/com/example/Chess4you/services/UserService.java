package com.example.Chess4you.services;

import com.example.Chess4you.model.User;
import com.example.Chess4you.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
