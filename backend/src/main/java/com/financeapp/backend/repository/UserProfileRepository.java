package com.financeapp.backend.repository;

import com.financeapp.backend.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserProfileRepository extends JpaRepository<UserProfile, UUID> {}
