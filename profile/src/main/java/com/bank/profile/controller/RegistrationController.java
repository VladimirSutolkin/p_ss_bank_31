package com.bank.profile.controller;


import com.bank.profile.dto.RegistrationDto;
import com.bank.profile.service.RegistrationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/registrations")
@Api(value = "Registration Management System")
public class RegistrationController {
    private final RegistrationService registrationService;
    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @ApiOperation(value = "Get all registrations", response = List.class)
    @GetMapping
    public List<RegistrationDto> getAllRegistrations() {
        logger.info("Received request to get all registrations");
        return registrationService.getAllRegistrations();
    }
    @ApiOperation(value = "Get registration by ID", response = RegistrationDto.class)
    @GetMapping("/{id}")
    public RegistrationDto getRegistrationById(@PathVariable Long id) {
        logger.info("Received request to get registration with id {}", id);
        return registrationService.getRegistrationById(id);
    }

    @ApiOperation(value = "Create a new registration")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRegistration(@RequestBody RegistrationDto registrationDto) {
        logger.info("Received request to create a new registration");
        registrationService.createRegistration(registrationDto);
    }

    @ApiOperation(value = "Update registration by ID")
    @PutMapping("/{id}")
    public void updateRegistration(@PathVariable Long id, @RequestBody RegistrationDto registrationDto) {
        logger.info("Received request to update registration with id {}", id);
        registrationService.updateRegistration(id, registrationDto);
    }

    @ApiOperation(value = "Delete registration by ID")
    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        logger.info("Received request to delete registration with id {}", id);
        registrationService.deleteRegistration(id);
    }
}