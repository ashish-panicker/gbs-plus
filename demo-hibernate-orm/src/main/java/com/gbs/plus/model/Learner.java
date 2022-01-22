package com.gbs.plus.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "learners")
public class Learner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "learner_id")
    private Integer learnerId;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDate hireDate;

    public Learner() {}

    public Learner(String firstName, String lastName, String email, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
    }


    public Learner(Integer learnerId, String firstName, String lastName, String email,
            LocalDate hireDate) {
        this.learnerId = learnerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
    }

    public Integer getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(Integer learnerId) {
        this.learnerId = learnerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Learner [email=%s, firstName=%s, hireDate=%s, lastName=%s, learnerId=%s]", email,
                firstName, hireDate, lastName, learnerId);
    }



}
