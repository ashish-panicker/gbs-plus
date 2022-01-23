package com.gbs.plus.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.gbs.plus.model.embeddable.Address;
import com.gbs.plus.model.embeddable.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "trainers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainer_id")
    private Integer trainerId;

    @Embedded
    private Name name;

    private String email;

    private String specilization;

    @Embedded
    private Address address;


    public Trainer(Name name, Address address, String email, String specilization) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.specilization = specilization;
    }
}
