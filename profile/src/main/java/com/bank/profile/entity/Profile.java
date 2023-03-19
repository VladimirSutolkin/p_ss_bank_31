package com.bank.profile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private com.bank.profile.entity.passport passport;

    @Valid
    @ManyToOne
    @JoinColumn(name = "actualregistration_id")
    private ActualRegistrationEntity actualRegistration;

}