package com.example.crowdfunding.service;

import com.example.crowdfunding.model.User;
import com.example.crowdfunding.repository.CampaignRepository;
import com.example.crowdfunding.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CampaignRepository campaignRepository;

    // Create or Update user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    // Delete user by ID
    public void deleteUser(String userId) {

        // Delete all campaigns associated with the user (based on userName)
        campaignRepository.deleteByUserName(userId);

        // Delete the user
        userRepository.deleteById(userId);
    }
}
