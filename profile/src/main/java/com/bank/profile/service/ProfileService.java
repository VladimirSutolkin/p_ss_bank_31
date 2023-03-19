package com.bank.profile.service;

import com.bank.profile.dto.ProfileDto;
import com.bank.profile.entity.Profile;
import com.bank.profile.mapper.ProfileMapper;
import com.bank.profile.repository.ActualRegistrationRepository;
import com.bank.profile.repository.PassportRepository;
import com.bank.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProfileService {
    private final ProfileRepository profileRepository;
    private final PassportRepository passportRepository;
    private final ActualRegistrationRepository actualRegistrationRepository;
    private final ProfileMapper profileMapper;

    public ProfileService(ProfileRepository profileRepository, PassportRepository passportRepository,
                          ActualRegistrationRepository actualRegistrationRepository, ProfileMapper profileMapper) {
        this.profileRepository = profileRepository;
        this.passportRepository = passportRepository;
        this.actualRegistrationRepository = actualRegistrationRepository;
        this.profileMapper = profileMapper;
    }

    public List<ProfileDto> getAllProfiles() {
        List<Profile> profiles = profileRepository.findAll();
        return profiles.stream().map(profileMapper::toDto).collect(Collectors.toList());
    }

    public ProfileDto getProfileById(Long id) {
        Profile profile = profileRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Profile not found"));
        return profileMapper.toDto(profile);
    }

    public void createProfile(ProfileDto profileDto) {
        Profile profile = profileMapper.toEntity(profileDto);
        profile.setPassport(passportRepository.findById(profileDto.getPassport().getId())
                .orElseThrow(() -> new EntityNotFoundException("Passport not found")));
        if (profileDto.getActualRegistration() != null) {
            profile.setActualRegistration(actualRegistrationRepository.findById(profileDto.getActualRegistration().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Actual registration not found")));
        }
        profileRepository.save(profile);
    }

    public void updateProfile(Long id, ProfileDto profileDto) {
        Profile profile = profileRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Profile not found"));
        profile.setPhoneNumber(profileDto.getPhoneNumber());
        profile.setEmail(profileDto.getEmail());
        profile.setNameOnCard(profileDto.getNameOnCard());
        profile.setInn(profileDto.getInn());
        profile.setSnils(profileDto.getSnils());
        profile.setPassport(passportRepository.findById(profileDto.getPassport().getId())
                .orElseThrow(() -> new EntityNotFoundException("Passport not found")));
        if (profileDto.getActualRegistration() != null) {
            profile.setActualRegistration(actualRegistrationRepository.findById(profileDto.getActualRegistration().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Actual registration not found")));
        } else {
            profile.setActualRegistration(null);
        }
        profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}