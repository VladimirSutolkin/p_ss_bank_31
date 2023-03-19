package com.bank.profile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "passport")
public class passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Series is required")
    @Min(value = 1000, message = "Series should be 4 digits")
    @Max(value = 9999, message = "Series should be 4 digits")
    @Column(name = "series")
    private Integer series;

    @NotNull(message = "Number is required")
    @Min(value = 100000L, message = "Number should be 6 digits")
    @Max(value = 999999L, message = "Number should be 6 digits")
    @Column(name = "number")
    private Long number;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name should not exceed 50 characters")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name should not exceed 50 characters")
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 50, message = "Middle name should not exceed 50 characters")
    @Column(name = "middle_name")
    private String middleName;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "^(MALE|FEMALE)$", message = "Gender should be either MALE or FEMALE")
    @Column(name = "gender")
    private String gender;

    @NotNull(message = "Birth date is required")
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @NotBlank(message = "Birth place is required")
    @Size(max = 100, message = "Birth place should not exceed 100 characters")
    @Column(name = "birth_place")
    private String birthPlace;

    @NotBlank(message = "Issued by is required")
    @Size(max = 100, message = "Issued by should not exceed 100 characters")
    @Column(name = "issued_by")
    private String issuedBy;

    @NotNull(message = "Date of issue is required")
    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @NotNull(message = "Division code is required")
    @Min(value = 100, message = "Division code should be 3 digits")
    @Max(value = 999, message = "Division code should be 3 digits")
    @Column(name = "division_code")
    private Integer divisionCode;


    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @NotNull(message = "Registration id is required")
    @ManyToOne
    @JoinColumn(name = "registration_id")
    private RegistrationEntity registration;


}