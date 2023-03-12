package com.bank.profile.controller;

import com.bank.profile.entity.ActualRegistration;
import com.bank.profile.service.ActualRegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actual-registrations")
public class ActualRegistrationController {



    private final ActualRegistrationService actualRegistrationService;



    public ActualRegistrationController(ActualRegistrationService actualRegistrationService) {
        this.actualRegistrationService = actualRegistrationService;
    }



    @GetMapping
    public List<ActualRegistration> getAllActualRegistrations() {
        return actualRegistrationService.getAllActualRegistrations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActualRegistration> getActualRegistrationById(@PathVariable Long id) {
        Optional<ActualRegistration> actualRegistration = actualRegistrationService.getActualRegistrationById(id);
        if (actualRegistration.isPresent()) {
            return ResponseEntity.ok(actualRegistration.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<ActualRegistration> createActualRegistration(@RequestBody ActualRegistration actualRegistration) {
        ActualRegistration createdActualRegistration = actualRegistrationService.createActualRegistration(actualRegistration);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdActualRegistration);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ActualRegistration> updateActualRegistration(@PathVariable Long id, @RequestBody ActualRegistration actualRegistration) {
        ActualRegistration updatedActualRegistration = actualRegistrationService.updateActualRegistration(id, actualRegistration);
        if (updatedActualRegistration != null) {
            return ResponseEntity.ok(updatedActualRegistration);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActualRegistration(@PathVariable Long id) {
        actualRegistrationService.deleteActualRegistration(id);
        return ResponseEntity.noContent().build();
    }

}