package com.gbs.plus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainers")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainer_id")
    private Integer trainerId;

    private String firstName;

    private String lastName;

    private String email;

    private String specilization;

    public Trainer() {}

    public Trainer(String firstName, String lastName, String email, String specilization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specilization = specilization;
    }

    public Trainer(Integer trainerId, String firstName, String lastName, String email,
            String specilization) {
        this.trainerId = trainerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specilization = specilization;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
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

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }


    @Override
    public String toString() {
        return String.format(
                "Trainer [email=%s, firstName=%s, lastName=%s, specilization=%s, trainerId=%s]",
                email, firstName, lastName, specilization, trainerId);
    }


}
