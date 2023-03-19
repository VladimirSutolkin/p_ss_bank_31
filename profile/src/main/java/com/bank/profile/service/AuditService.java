package com.bank.profile.service;

import com.bank.profile.dto.AuditDto;
import com.bank.profile.entity.AuditEntity;
import com.bank.profile.mapper.AuditMapper;
import com.bank.profile.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditService {

    private final AuditRepository auditRepository;
    private final AuditMapper auditMapper;

    @Autowired
    public AuditService(AuditRepository auditRepository, AuditMapper auditMapper) {
        this.auditRepository = auditRepository;
        this.auditMapper = auditMapper;
    }

    public List<AuditDto> getAllAudits() {
        List<AuditEntity> entities = auditRepository.findAll();
        return auditMapper.toDtoList(entities);
    }

    public AuditDto getAuditById(Long id) {
        Optional<AuditEntity> entity = auditRepository.findById(id);
        return entity.map(auditMapper::toDto).orElse(null);
    }

    public void createAudit(AuditDto auditDto) {
        AuditEntity entity = auditMapper.toEntity(auditDto);
        auditRepository.save(entity);
    }

}
