package com.bank.profile.controller;

import com.bank.profile.entity.audit;
import com.bank.profile.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @PostMapping("/create")
    public ResponseEntity<audit> createAudit(@RequestBody audit audit) {
        audit createdAudit = auditService.createAudit(audit);
        return new ResponseEntity<>(createdAudit, HttpStatus.CREATED);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<audit> readAudit(@PathVariable("id") Long id) {
        audit audit = auditService.getAuditById(id);
        return new ResponseEntity<>(audit, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<audit> updateAudit(@PathVariable("id") Long id, @RequestBody audit audit) {
        audit.setId(id);
        audit updatedAudit = auditService.updateAudit(audit);
        return new ResponseEntity<>(updatedAudit, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAudit(@PathVariable("id") Long id) {
        auditService.deleteAuditById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<audit>> getAllAudits() {
        List<audit> audits = auditService.getAllAudits();
        return new ResponseEntity<>(audits, HttpStatus.OK);
    }
}


