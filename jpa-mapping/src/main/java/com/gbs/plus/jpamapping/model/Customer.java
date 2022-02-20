package com.gbs.plus.jpamapping.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "work_address")
    private Address workAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_address")
    private Address homeAddress;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Order> orders;

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email +  "]";
    }
}
