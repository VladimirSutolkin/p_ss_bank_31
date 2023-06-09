package com.bank.profile.entity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Phone number is required")
    @Column(name = "phone_number", nullable = false)
    private Long phoneNumber;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Column(name = "email")
    private String email;
    @NotBlank(message = "Name on card is required")
    @Size(max = 50, message = "Name on card should not exceed 50 characters")
    @Column(name = "name_on_card")
    private String nameOnCard;
    @NotNull(message = "INN is required")
    @Digits(integer = 12, fraction = 0, message = "INN should be 12 digits")
    @Column(name = "inn", unique = true)
    private Long inn;
    @NotNull(message = "SNILS is required")
    @Digits(integer = 11, fraction = 0, message = "SNILS should be 11 digits")
    @Column(name = "snils", unique = true)
    private Long snils;
    @Valid
    @ManyToOne
    @JoinColumn(name = "passport_id", nullable = false)
    private Passport passport;
    @Valid
    @ManyToOne
    @JoinColumn(name = "actualregistration_id")
    private ActualRegistrationEntity actualRegistration;

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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public ActualRegistrationEntity getActualRegistration() {
        return actualRegistration;
    }

    public void setActualRegistration(ActualRegistrationEntity actualRegistration) {
        this.actualRegistration = actualRegistration;
    }
}