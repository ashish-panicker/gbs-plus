package com.gbs.plus.jpamapping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String street;

    private String city;

    private String state;

    private String zip;

    @Override
    public String toString() {
        return "Address [id=" + id + ", street=" + street + 
                ", city=" + city + ", state=" + state + ", zip=" + zip
                + "]";
    }

}
