package com.bank.profile.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class ProfileDto {
    private Long id;

    @NotNull(message = "Phone number is required")
    private Long phoneNumber;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Name on card is required")
    @Size(max = 50, message = "Name on card should not exceed 50 characters")
    private String nameOnCard;

    @NotNull(message = "INN is required")
    @Digits(integer = 12, fraction = 0, message = "INN should be 12 digits")
    private Long inn;

    @NotNull(message = "SNILS is required")
    @Digits(integer = 11, fraction = 0, message = "SNILS should be 11 digits")
    private Long snils;

    @Valid
    private PassportDto passport;

    @Valid
    private ActualRegistrationDTO actualRegistration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Long getSnils() {
        return snils;
    }

    public void setSnils(Long snils) {
        this.snils = snils;
    }

    public PassportDto getPassport() {
        return passport;
    }

    public void setPassport(PassportDto passport) {
        this.passport = passport;
    }

    public ActualRegistrationDTO getActualRegistration() {
        return actualRegistration;
    }

    public void setActualRegistration(ActualRegistrationDTO actualRegistration) {
        this.actualRegistration = actualRegistration;
    }
}