package com.example.crowdfunding.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Document(collection = "campaigns")  // MongoDB collection name
public class Campaign {

    @Id  // MongoDB's primary key annotation
    private String id; // (MongoDB default ObjectId)

    private String owner; // Solidity address mapped as a String
    private String title;
    private String description;

    private BigInteger target; // Solidity uint256
    private BigInteger deadline; // Solidity uint256

    private BigInteger amountCollected = BigInteger.ZERO; // Default to 0

    private String image;

    private List<String> donators; // Solidity address[] mapped as List<String>
    private List<BigInteger> donations; // Solidity uint256[] mapped as List<BigInteger>

    private String userName;

    // Constructors
    public Campaign() {}

    public Campaign(String owner, String title, String description, BigInteger target, BigInteger deadline, String image) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.target = target;
        this.deadline = deadline;
        this.image = image;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getTarget() {
        return target;
    }

    public void setTarget(BigInteger target) {
        this.target = target;
    }

    public BigInteger getDeadline() {
        return deadline;
    }

    public void setDeadline(BigInteger deadline) {
        this.deadline = deadline;
    }

    public BigInteger getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(BigInteger amountCollected) {
        this.amountCollected = amountCollected;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getDonators() {
        return donators;
    }

    public void setDonators(List<String> donators) {
        this.donators = donators;
    }

    public List<BigInteger> getDonations() {
        return donations;
    }

    public void setDonations(List<BigInteger> donations) {
        this.donations = donations;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
