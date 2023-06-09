package com.bank.profile.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "actual_registration")
public class ActualRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Country is required")
    @Size(max = 100, message = "Country should not exceed 100 characters")
    @Column(name = "country", nullable = false)
    private String country;

    @NotBlank(message = "Region is required")
    @Size(max = 100, message = "Region should not exceed 100 characters")
    @Column(name = "region")
    private String region;

    @NotBlank(message = "City is required")
    @Size(max = 100, message = "City should not exceed 100 characters")
    @Column(name = "city")
    private String city;

    @Size(max = 100, message = "District should not exceed 100 characters")
    @Column(name = "district")
    private String district;

    @NotBlank(message = "Locality is required")
    @Size(max = 100, message = "Locality should not exceed 100 characters")
    @Column(name = "locality")
    private String locality;

    @NotBlank(message = "Street is required")
    @Size(max = 100, message = "Street should not exceed 100 characters")
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

    public ActualRegistrationEntity() {
    }

    public ActualRegistrationEntity(Long id, String country, String region, String city, String district, String locality, String street, String houseNumber, String houseBlock, String flatNumber, Long index) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.city = city;
        this.district = district;
        this.locality = locality;
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
        this.flatNumber = flatNumber;
        this.index = index;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseBlock() {
        return houseBlock;
    }

    public void setHouseBlock(String houseBlock) {
        this.houseBlock = houseBlock;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }
}