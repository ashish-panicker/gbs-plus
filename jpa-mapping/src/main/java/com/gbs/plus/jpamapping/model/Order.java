package com.gbs.plus.jpamapping.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDate orderDate;

    private Double total;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order", fetch = FetchType.EAGER)
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderDate=" + orderDate + ", total=" + total + "invoice "+ invoice.getId() + "]";
    }

}
