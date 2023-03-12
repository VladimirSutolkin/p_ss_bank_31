package com.bank.profile.service;

import com.bank.profile.entity.ActualRegistration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ActualRegistrationService {

    List<ActualRegistration> getAllActualRegistrations();

    Optional<ActualRegistration> getActualRegistrationById(Long id);

    ActualRegistration createActualRegistration(ActualRegistration actualRegistration);

    ActualRegistration updateActualRegistration(Long id, ActualRegistration actualRegistration);

    void deleteActualRegistration(Long id);

}