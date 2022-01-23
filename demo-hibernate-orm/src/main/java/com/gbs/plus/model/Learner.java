package com.gbs.plus.model;

import java.time.LocalDate;
import javax.persistence.Column;
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
@Table(name = "learners")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Learner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "learner_id")
    private Integer learnerId;

    private Name name;

    private String email;

    private LocalDate hireDate;

    private Address address;

    public Learner(Name name, Address address, String email, LocalDate hireDate) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.hireDate = hireDate;
    }
}
