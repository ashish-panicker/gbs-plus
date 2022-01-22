package com.gbs.plus.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {

    private int authorId;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String genre;

    private String phoneNumber;

    public Author(String firstName, String lastName, LocalDate birthDate, String genre, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.genre = genre;
        this.phoneNumber = phoneNumber;
    }


}
