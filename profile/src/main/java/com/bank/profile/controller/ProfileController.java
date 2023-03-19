package com.bank.profile.controller;

import com.bank.profile.dto.ProfileDto;
import com.bank.profile.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileService profileService;
    private final Logger logger = LoggerFactory.getLogger(ProfileController.class);

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<ProfileDto> getAllProfiles() {
        logger.info("Received request to get all profiles");
        return profileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public ProfileDto getProfileById(@PathVariable Long id) {
        logger.info("Received request to get profile with id {}", id);
        return profileService.getProfileById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProfile(@RequestBody ProfileDto profileDto) {
        logger.info("Received request to create a new profile");
        profileService.createProfile(profileDto);
    }

    @PutMapping("/{id}")
    public void updateProfile(@PathVariable Long id, @RequestBody ProfileDto profileDto) {
        logger.info("Received request to update profile with id {}", id);
        profileService.updateProfile(id, profileDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id) {
        logger.info("Received request to delete profile with id {}", id);
        profileService.deleteProfile(id);
    }
}