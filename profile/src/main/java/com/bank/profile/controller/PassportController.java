package com.bank.profile.controller;

import com.bank.profile.dto.PassportDto;
import com.bank.profile.service.PassportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passports")
@Api(value = "Passport Controller", description = "REST API for managing passports")
public class PassportController {

    private final PassportService passportService;
    private final Logger logger = LoggerFactory.getLogger(PassportController.class);

    public PassportController(PassportService passportService) {
        this.passportService = passportService;
    }

    @GetMapping
    @ApiOperation(value = "Get all passports", response = List.class)
    public List<PassportDto> getAllPassports() {
        logger.info("Received request to get all passports");
        return passportService.getAllPassports();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get passport by id", response = PassportDto.class)
    public PassportDto getPassportById(@PathVariable Long id) {
        logger.info("Received request to get passport by id {}", id);
        return passportService.getPassportById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create passport")
    public void createPassport(@RequestBody PassportDto passportDto) {
        logger.info("Received request to create passport with data {}", passportDto);
        passportService.createPassport(passportDto);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update passport")
    public void updatePassport(@PathVariable Long id, @RequestBody PassportDto passportDto) {
        logger.info("Received request to update passport with id {} and data {}", id, passportDto);
        passportService.updatePassport(id, passportDto);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete passport")
    public void deletePassport(@PathVariable Long id) {
        logger.info("Received request to delete passport with id {}", id);
        passportService.deletePassport(id);
    }
}