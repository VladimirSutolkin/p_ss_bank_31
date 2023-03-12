package com.bank.profile.service;

import com.bank.profile.entity.audit;
import com.bank.profile.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditServiceImpl implements AuditService {

    private final AuditRepository auditRepository;

    @Autowired
    public AuditServiceImpl(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @Override
    public audit createAudit(audit audit) {
        return auditRepository.save(audit);
    }

    @Override
    public audit updateAudit(audit audit) {
        return auditRepository.save(audit);
    }
@Override
    public void deleteAuditById(Long id) {
    Optional<audit> optionalAudit = auditRepository.findById(id);
    auditRepository.deleteById(id);
}

    @Override
    public audit getAuditById(Long id) {
        Optional<audit> optionalAudit = auditRepository.findById(id);
        return optionalAudit.get();
    }

    @Override
    public List<audit> getAllAudits() {
        return auditRepository.findAll();
    }
}