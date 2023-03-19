package com.bank.profile.controller;

import com.bank.profile.dto.AuditDto;
import com.bank.profile.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@RequestMapping("/audits")
public class AuditController {
    private final Logger logger = LoggerFactory.getLogger(AuditController.class);

    private final AuditService auditService;

    @Autowired
    public AuditController(AuditService auditService) {
        this.auditService = auditService;
    }

    @GetMapping
    public List<AuditDto> getAllAudits() {
        logger.info("Received request to get all audits.");
        List<AuditDto> audits = auditService.getAllAudits();
        logger.info("Returning {} audits.", audits.size());
        return audits;
    }

    @GetMapping("/{id}")
    public AuditDto getAuditById(@PathVariable Long id) {
        logger.info("Received request to get audit with id {}.", id);
        AuditDto audit = auditService.getAuditById(id);
        logger.info("Returning audit with id {}.", id);
        return audit;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAudit(@RequestBody AuditDto auditDto) {
        logger.info("Received request to create audit.");
        auditService.createAudit(auditDto);
        logger.info("Audit created successfully.");
    }
}