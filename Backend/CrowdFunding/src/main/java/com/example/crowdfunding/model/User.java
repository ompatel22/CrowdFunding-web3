package com.example.crowdfunding.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // Specifies the MongoDB collection name
public class User {

    @Id  // Marks this field as the identifier for the MongoDB document
    private String userId;  // In MongoDB, IDs are usually Strings (could also be ObjectId)

    private String userName;
    private String password;

    // Default constructor
    public User() {}

    // Constructor
    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    // Getter and Setter methods
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
