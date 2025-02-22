package com.example.crowdfunding.repository;

import com.example.crowdfunding.model.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CampaignRepository extends MongoRepository<Campaign, String> {
    // Find campaigns by the userName
    List<Campaign> findByUserName(String userName);

    // Delete campaigns by userName
    void deleteByUserName(String userName);
}
