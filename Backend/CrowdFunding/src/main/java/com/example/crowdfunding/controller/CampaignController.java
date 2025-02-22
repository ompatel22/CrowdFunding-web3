package com.example.crowdfunding.controller;

import com.example.crowdfunding.model.Campaign;
import com.example.crowdfunding.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    // Create or Update campaign
    @PostMapping
    public ResponseEntity<Campaign> createCampaign(@RequestBody Campaign campaign) {
        Campaign savedCampaign = campaignService.saveCampaign(campaign);
        return new ResponseEntity<>(savedCampaign, HttpStatus.CREATED);
    }

    // Get all campaigns
    @GetMapping
    public ResponseEntity<List<Campaign>> getAllCampaigns() {
        List<Campaign> campaigns = campaignService.getAllCampaigns();
        return new ResponseEntity<>(campaigns, HttpStatus.OK);
    }

    // Get campaign by ID
    @GetMapping("/{id}")
    public ResponseEntity<Campaign> getCampaignById(@PathVariable String id) {
        Optional<Campaign> campaign = campaignService.getCampaignById(id);
        return campaign.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update campaign by ID
    @PutMapping("/{id}")
    public ResponseEntity<Campaign> updateCampaign(@PathVariable String id, @RequestBody Campaign campaign) {
        Optional<Campaign> existingCampaign = campaignService.getCampaignById(id);
        if (existingCampaign.isPresent()) {
            campaign.setId(id);  // Ensure the ID is not changed
            Campaign updatedCampaign = campaignService.saveCampaign(campaign);
            return new ResponseEntity<>(updatedCampaign, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete campaign by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCampaign(@PathVariable String id) {
        Optional<Campaign> existingCampaign = campaignService.getCampaignById(id);
        if (existingCampaign.isPresent()) {
            campaignService.deleteCampaign(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
