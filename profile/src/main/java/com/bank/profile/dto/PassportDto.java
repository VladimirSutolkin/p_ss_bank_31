package com.bank.profile.dto;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class PassportDto {

    private Long id;

    @NotNull(message = "Series is required")
    @Min(value = 1000, message = "Series should be 4 digits")
    @Max(value = 9999, message = "Series should be 4 digits")
    private Integer series;

    @NotNull(message = "Number is required")
    @Min(value = 100000L, message = "Number should be 6 digits")
    @Max(value = 999999L, message = "Number should be 6 digits")
    private Long number;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name should not exceed 50 characters")
    private String lastName;

    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name should not exceed 50 characters")
    private String firstName;

    @Size(max = 50, message = "Middle name should not exceed 50 characters")
    private String middleName;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "^(MALE|FEMALE)$", message = "Gender should be either MALE or FEMALE")
    private String gender;

    @NotNull(message = "Birth date is required")
    private LocalDate birthDate;

    @NotBlank(message = "Birth place is required")
    @Size(max = 100, message = "Birth place should not exceed 100 characters")
    private String birthPlace;

    @NotBlank(message = "Issued by is required")
    @Size(max = 100, message = "Issued by should not exceed 100 characters")
    private String issuedBy;

    @NotNull(message = "Date of issue is required")
    private LocalDate dateOfIssue;

    @NotNull(message = "Division code is required")
    @Min(value = 100, message = "Division code should be 3 digits")
    @Max(value = 999, message = "Division code should be 3 digits")
    private Integer divisionCode;

    private LocalDate expirationDate;

    @NotNull(message = "Registration id is required")
    private Long registrationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Integer getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(Integer divisionCode) {
        this.divisionCode = divisionCode;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }
}