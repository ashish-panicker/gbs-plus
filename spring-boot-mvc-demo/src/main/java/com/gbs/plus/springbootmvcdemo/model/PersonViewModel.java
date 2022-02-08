package com.gbs.plus.springbootmvcdemo.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonViewModel {

    private Integer id;

    @NotBlank(message = "First Name is required")
    @Size(min = 2, max = 30, message = "First Name must be between 2 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First Name must contain only letters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(min = 1, max = 30, message = "Last Name must be between 2 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last Name must contain only letters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Size(min = 5, max = 50, message = "Email must be between 5 and 30 characters")
    @Email(message = "Email must be a valid email address")
    private String email;

    @NotBlank(message = "Phone is required")
    @Size(min = 10, max = 10, message = "Phone must be 10 characters")
    @Digits(integer = 10, fraction = 0, message = "Phone must be 10 digits")
    private String phoneNumber;

    @NotBlank(message = "Address is required")
    @Size(min = 5, max = 100, message = "Address must be between 5 and 30 characters")
    private String address;

}
