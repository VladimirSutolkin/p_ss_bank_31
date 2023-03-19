package com.bank.profile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "registration")
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Country is required")
    @Size(max = 50, message = "Country should not exceed 50 characters")
    @Column(name = "country", nullable = false)
    private String country;

    @NotBlank(message = "Region is required")
    @Size(max = 50, message = "Region should not exceed 50 characters")
    @Column(name = "region")
    private String region;

    @NotBlank(message = "City is required")
    @Size(max = 50, message = "City should not exceed 50 characters")
    @Column(name = "city")
    private String city;

    @Size(max = 50, message = "District should not exceed 50 characters")
    @Column(name = "district")
    private String district;

    @NotBlank(message = "Locality is required")
    @Size(max = 50, message = "Locality should not exceed 50 characters")
    @Column(name = "locality")
    private String locality;

    @NotBlank(message = "Street is required")
    @Size(max = 50, message = "Street should not exceed 50 characters")
    @Column(name = "street")
    private String street;

    @NotBlank(message = "House number is required")
    @Size(max = 10, message = "House number should not exceed 10 characters")
    @Column(name = "house_number")
    private String houseNumber;

    @Size(max = 10, message = "House block should not exceed 10 characters")
    @Column(name = "house_block")
    private String houseBlock;

    @NotBlank(message = "Flat number is required")
    @Size(max = 10, message = "Flat number should not exceed 10 characters")
    @Column(name = "flat_number")
    private String flatNumber;

    @NotNull(message = "Index is required")
    @Min(value = 100000, message = "Index should be at least 6 digits")
    @Max(value = 999999, message = "Index should not exceed 6 digits")
    @Column(name = "index", nullable = false)
    private Long index;

    @NotNull(message = "Column is required")
    @Min(value = 1, message = "Column should be at least 1")
    @Column(name = "column")
    private Integer column;

   }