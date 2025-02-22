package com.example.crowdfunding.service;

import com.example.crowdfunding.model.Campaign;
import com.example.crowdfunding.model.User;
import com.example.crowdfunding.repository.CampaignRepository;
import com.example.crowdfunding.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private UserRepository userRepository;

    // Create or Update campaign
    public Campaign saveCampaign(Campaign campaign) {
        // Check if the user exists by userId
        Optional<User> user = userRepository.findByUserName(campaign.getUserName());

        if (user.isEmpty()) {
            // User not found, throw exception or return null/meaningful response
            throw new RuntimeException("User with userId " + campaign.getId() + " does not exist.");
        }

        return campaignRepository.save(campaign);
    }

    // Get all campaigns
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    // Get campaign by ID
    public Optional<Campaign> getCampaignById(String id) {
        return campaignRepository.findById(id);
    }

    // Delete campaign by ID
    public void deleteCampaign(String id) {
        campaignRepository.deleteById(id);
    }
}
