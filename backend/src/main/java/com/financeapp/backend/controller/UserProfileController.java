package com.financeapp.backend.controller;

import com.financeapp.backend.model.UserProfile;
import com.financeapp.backend.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service){
        this.service = service;
    }

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user){
        return service.create(user.getEmail(), user.getFullName());
    }

    @GetMapping
    public List<UserProfile> getAll(){
        return service.findAll();
    }
}
