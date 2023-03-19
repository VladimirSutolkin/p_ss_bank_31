package com.bank.profile.service;

import com.bank.profile.dto.PassportDto;
import com.bank.profile.entity.Passport;
import com.bank.profile.entity.RegistrationEntity;
import com.bank.profile.mapper.PassportMapper;
import com.bank.profile.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PassportService {

    private final PassportRepository passportRepository;
    private final PassportMapper passportMapper;

    @Autowired
    public PassportService(PassportRepository passportRepository, PassportMapper passportMapper) {
        this.passportRepository = passportRepository;
        this.passportMapper = passportMapper;
    }

    public List<PassportDto> getAllPassports() {
        List<Passport> passports = passportRepository.findAll();
        return passports.stream()
                .map(passportMapper::toDto)
                .collect(Collectors.toList());
    }

    public PassportDto getPassportById(Long id) {
        Passport passport = passportRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Passport with id " + id + " not found"));
        return passportMapper.toDto(passport);
    }

    public void createPassport(PassportDto passportDto) {
        Passport passport = passportMapper.toEntity(passportDto);
        passportRepository.save(passport);
    }

    public void updatePassport(Long id, PassportDto passportDto) {
        Passport passport = passportRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Passport with id " + id + " not found"));
        passport.setSeries(passportDto.getSeries());
        passport.setNumber(passportDto.getNumber());
        passport.setLastName(passportDto.getLastName());
        passport.setFirstName(passportDto.getFirstName());
        passport.setMiddleName(passportDto.getMiddleName());
        passport.setGender(passportDto.getGender());
        passport.setBirthDate(passportDto.getBirthDate());
        passport.setBirthPlace(passportDto.getBirthPlace());
        passport.setIssuedBy(passportDto.getIssuedBy());
        passport.setDateOfIssue(passportDto.getDateOfIssue());
        passport.setDivisionCode(passportDto.getDivisionCode());
        passport.setExpirationDate(passportDto.getExpirationDate());
        RegistrationEntity registration = new RegistrationEntity();
        registration.setId(passportDto.getRegistrationId());
        passport.setRegistration(registration);
        passportRepository.save(passport);
    }

    public void deletePassport(Long id) {
        passportRepository.deleteById(id);
    }
}