package com.bank.profile.controller;

import com.bank.profile.dto.ProfileDto;
import com.bank.profile.service.ProfileService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "Get all profiles", notes = "Get a list of all bank profiles")
    @GetMapping
    public List<ProfileDto> getAllProfiles() {
        logger.info("Received request to get all profiles");
        return profileService.getAllProfiles();
    }

    @ApiOperation(value = "Get a profile by id", notes = "Get a bank profile by its id")
    @GetMapping("/{id}")
    public ProfileDto getProfileById(@PathVariable Long id) {
        logger.info("Received request to get profile with id {}", id);
        return profileService.getProfileById(id);
    }

    @ApiOperation(value = "Create a new profile", notes = "Create a new bank profile")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProfile(@RequestBody ProfileDto profileDto) {
        logger.info("Received request to create a new profile");
        profileService.createProfile(profileDto);
    }

    @ApiOperation(value = "Update a profile", notes = "Update an existing bank profile")
    @PutMapping("/{id}")
    public void updateProfile(@PathVariable Long id, @RequestBody ProfileDto profileDto) {
        logger.info("Received request to update profile with id {}", id);
        profileService.updateProfile(id, profileDto);
    }

    @ApiOperation(value = "Delete a profile", notes = "Delete a bank profile by its id")
    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id) {
        logger.info("Received request to delete profile with id {}", id);
        profileService.deleteProfile(id);
    }
}