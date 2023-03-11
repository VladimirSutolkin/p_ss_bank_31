package com.bank.profile.entity;





import javax.persistence.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "phone_number", nullable = false)
    private Long phoneNumber;

    @Column(name = "email", length = 264)
    private String email;

    @Column(name = "name_on_card", length = 370)
    private String nameOnCard;

    @Column(name = "inn")
    private Long inn;

    @Column(name = "snils")
    private Long snils;

    @Column(name = "passport_id", nullable = false)
    private Long passportId;

    @Column(name = "actual_registration_id")
    private Long actualRegistrationId;

    public profile() {
    }

    public profile(Long id, Long phoneNumber, String email, String nameOnCard, Long inn, Long snils, Long passportId, Long actualRegistrationId) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nameOnCard = nameOnCard;
        this.inn = inn;
        this.snils = snils;
        this.passportId = passportId;
        this.actualRegistrationId = actualRegistrationId;
    }

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

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    public Long getActualRegistrationId() {
        return actualRegistrationId;
    }

    public void setActualRegistrationId(Long actualRegistrationId) {
        this.actualRegistrationId = actualRegistrationId;
    }
}