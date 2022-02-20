package com.gbs.plus.jpamapping.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue
    private Integer id;

    private Double totalDue;

    private Double totalPaid;

    private LocalDate invoiceDate;

    private LocalDate dueDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;

    @Override
    public String toString() {
        return "Invoice [id=" + id + ", totalDue=" + totalDue + 
                ", totalPaid=" + totalPaid + ", invoiceDate="
                + invoiceDate + ", dueDate=" + dueDate + "]";
    }
    
}
