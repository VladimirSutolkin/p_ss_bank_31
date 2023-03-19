package com.bank.profile.service;

import com.bank.profile.dto.RegistrationDto;
import com.bank.profile.entity.RegistrationEntity;
import com.bank.profile.mapper.RegistrationMapper;
import com.bank.profile.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;
    private final RegistrationMapper registrationMapper;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository, RegistrationMapper registrationMapper) {
        this.registrationRepository = registrationRepository;
        this.registrationMapper = registrationMapper;
    }

    public List<RegistrationDto> getAllRegistrations() {
        List<RegistrationEntity> entities = registrationRepository.findAll();
        return entities.stream().map(registrationMapper::toDto).collect(Collectors.toList());
    }

    public RegistrationDto getRegistrationById(Long id) {
        Optional<RegistrationEntity> entity = registrationRepository.findById(id);
        return entity.map(registrationMapper::toDto).orElse(null);
    }

    public void createRegistration(RegistrationDto registrationDto) {
        RegistrationEntity entity = registrationMapper.toEntity(registrationDto);
        registrationRepository.save(entity);
    }

    public void updateRegistration(Long id, RegistrationDto registrationDto) {
        Optional<RegistrationEntity> optionalEntity = registrationRepository.findById(id);
        if (optionalEntity.isPresent()) {
            RegistrationEntity entity = optionalEntity.get();
            entity.setCountry(registrationDto.getCountry());
            entity.setRegion(registrationDto.getRegion());
            entity.setCity(registrationDto.getCity());
            entity.setDistrict(registrationDto.getDistrict());
            entity.setLocality(registrationDto.getLocality());
            entity.setStreet(registrationDto.getStreet());
            entity.setHouseNumber(registrationDto.getHouseNumber());
            entity.setHouseBlock(registrationDto.getHouseBlock());
            entity.setFlatNumber(registrationDto.getFlatNumber());
            entity.setIndex(registrationDto.getIndex());
            entity.setColumn(registrationDto.getColumn());
            registrationRepository.save(entity);
        }
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}