package com.financeapp.backend.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_profiles")
public class UserProfile {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String fullName;

    public UserProfile() {}

    public UserProfile(String email, String fullName) {
        this.email = email;
        this.fullName = fullName;
    }

    public UUID getId() { return id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) { this.fullName = fullName; }
}
