package com.bank.profile.service;

import com.bank.profile.entity.ActualRegistration;
import com.bank.profile.repository.ActualRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ActualRegistrationServiceImpl implements ActualRegistrationService{
    private final ActualRegistrationRepository actualRegistrationRepository;

    @Autowired
    public ActualRegistrationServiceImpl(ActualRegistrationRepository actualRegistrationRepository) {
        this.actualRegistrationRepository = actualRegistrationRepository;
    }



    public List<ActualRegistration> getAllActualRegistrations() {
        return actualRegistrationRepository.findAll();
    }

    public Optional<ActualRegistration> getActualRegistrationById(Long id) {
        return actualRegistrationRepository.findById(id);
    }

    public ActualRegistration createActualRegistration(ActualRegistration actualRegistration) {
        return actualRegistrationRepository.save(actualRegistration);
    }

    public ActualRegistration updateActualRegistration(Long id, ActualRegistration actualRegistration) {
        Optional<ActualRegistration> existingActualRegistration = actualRegistrationRepository.findById(id);
        if (existingActualRegistration.isPresent()) {
            actualRegistration.setId(id);
            return actualRegistrationRepository.save(actualRegistration);
        } else {
            return null;
        }
    }

    public void deleteActualRegistration(Long id) {
        actualRegistrationRepository.deleteById(id);
    }
}

