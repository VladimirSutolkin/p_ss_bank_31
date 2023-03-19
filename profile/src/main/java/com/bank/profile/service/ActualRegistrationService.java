package com.bank.profile.service;

import com.bank.profile.dto.ActualRegistrationDTO;
import com.bank.profile.entity.ActualRegistrationEntity;
import com.bank.profile.mapper.ActualRegistrationMapper;
import com.bank.profile.repository.ActualRegistrationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class ActualRegistrationService {

    private final ActualRegistrationRepository repository;
    private final ActualRegistrationMapper mapper;

    public ActualRegistrationService(ActualRegistrationRepository repository, ActualRegistrationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ActualRegistrationDTO> findAll() {
        List<ActualRegistrationEntity> entities = repository.findAll();
        return entities.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}