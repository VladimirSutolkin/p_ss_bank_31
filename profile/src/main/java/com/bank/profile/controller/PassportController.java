package com.bank.profile.controller;

import com.bank.profile.dto.PassportDto;
import com.bank.profile.service.PassportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passports")
public class PassportController {

    private final PassportService passportService;
    private final Logger logger = LoggerFactory.getLogger(PassportController.class);

    public PassportController(PassportService passportService) {
        this.passportService = passportService;
    }

    @GetMapping
    public List<PassportDto> getAllPassports() {
        logger.info("Received request to get all passports");
        return passportService.getAllPassports();
    }

    @GetMapping("/{id}")
    public PassportDto getPassportById(@PathVariable Long id) {
        logger.info("Received request to get passport by id {}", id);
        return passportService.getPassportById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPassport(@RequestBody PassportDto passportDto) {
        logger.info("Received request to create passport with data {}", passportDto);
        passportService.createPassport(passportDto);
    }

    @PutMapping("/{id}")
    public void updatePassport(@PathVariable Long id, @RequestBody PassportDto passportDto) {
        logger.info("Received request to update passport with id {} and data {}", id, passportDto);
        passportService.updatePassport(id, passportDto);
    }

    @DeleteMapping("/{id}")
    public void deletePassport(@PathVariable Long id) {
        logger.info("Received request to delete passport with id {}", id);
        passportService.deletePassport(id);
    }
}