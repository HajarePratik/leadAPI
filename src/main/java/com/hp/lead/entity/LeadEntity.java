package com.hp.lead.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class LeadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer leadId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid first name")
    private String firstName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid middle name")
    private String middleName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Please enter valid last name")
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}+$", message = "Please enter valid mobile number")
    private String mobileNumber;

    @NotBlank
    private String gender;

    @NotBlank
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}+$", message = "Please enter valid date of birth")
    private String dob;

    @Email(message = "Please enter valid mail address")
    private String email;


}
