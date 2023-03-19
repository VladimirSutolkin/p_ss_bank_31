package com.bank.profile.controller;

import com.bank.profile.dto.ActualRegistrationDTO;
import com.bank.profile.service.ActualRegistrationService;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;


@RestController
@Log4j2
@RequestMapping("/api/actual-registration")
public class ActualRegistrationController {

    private final ActualRegistrationService service;
    private final Logger logger = LoggerFactory.getLogger(ActualRegistrationController.class);

    public ActualRegistrationController(ActualRegistrationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ActualRegistrationDTO>> findAll() {
        logger.info("Received request to get all actual registrations");
        List<ActualRegistrationDTO> dtos = service.findAll();
        logger.info("Returned {} actual registrations", dtos.size());
        return ResponseEntity.ok(dtos);
    }
}