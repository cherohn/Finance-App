package com.financeapp.backend.service;

import com.financeapp.backend.model.UserProfile;
import com.financeapp.backend.repository.UserProfileRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileRepository repository;

    public UserProfileService(UserProfileRepository repository) {
        this.repository = repository;
    }

    public UserProfile create(String email, String fullName){
        return  repository.save(new UserProfile(email, fullName));
    }

    public List<UserProfile> findAll(){
        return repository.findAll();
    }
}
