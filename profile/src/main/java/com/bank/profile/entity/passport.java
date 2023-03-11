package com.bank.profile.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "passport")
public class passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "series", nullable = false)
    private Integer series;

    @Column(name = "number", nullable = false)
    private Long number;

    @Column(name = "last_name", length = 255, nullable = false)
    private String lastName;

    @Column(name = "first_name", length = 255, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 255)
    private String middleName;

    @Column(name = "gender", length = 3, nullable = false)
    private String gender;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "birth_place", length = 480, nullable = false)
    private String birthPlace;

    @Column(name = "issued_by", columnDefinition = "text", nullable = false)
    private String issuedBy;

    @Column(name = "date_of_issue", nullable = false)
    private LocalDate dateOfIssue;

    @Column(name = "division_code", nullable = false)
    private Integer divisionCode;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "registration_id", nullable = false)
    private Long registrationId;

    public passport() {
    }

    public passport(Integer series, Long number, String lastName, String firstName, String middleName, String gender,
                    LocalDate birthDate, String birthPlace, String issuedBy, LocalDate dateOfIssue, Integer divisionCode,
                    LocalDate expirationDate, Long registrationId) {
        this.series = series;
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.issuedBy = issuedBy;
        this.dateOfIssue = dateOfIssue;
        this.divisionCode = divisionCode;
        this.expirationDate = expirationDate;
        this.registrationId = registrationId;
    }

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
