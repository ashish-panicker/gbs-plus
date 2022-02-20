package com.gbs.plus.jpamapping.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import com.gbs.plus.jpamapping.model.Invoice;
import com.gbs.plus.jpamapping.model.Order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Slf4j
public class OrderRepoTest {

    @Autowired
    private OrderRepo orderRepo;

    private Order order;
    private Invoice invoice;

    @BeforeEach
    public void setUp() {

        invoice = new Invoice();
        order = new Order();

        order.setOrderDate(LocalDate.now());
        order.setTotal(100.00);

        invoice.setDueDate(LocalDate.of(2022, 04, 15));
        invoice.setInvoiceDate(LocalDate.now());
        invoice.setTotalDue(100.00);
        invoice.setTotalPaid(0.00);

        order.setInvoice(invoice);
        invoice.setOrder(order);
    }
    
    @Test
    @DisplayName("Testing to check if OrderRepo is not null")
    public void testOrderRepoIsNotNull() {
        log.debug("BEGIN - testOrderRepoIsNotNull");
        assertThat(orderRepo).isNotNull();
        log.debug("END - testOrderRepoIsNotNull");
    }

    @Test
    @DisplayName("Testing to check if OrderRepo is able to save Order")
    public void testOrderRepoSaveOrder() {
        log.debug("BEGIN - testOrderRepoSaveOrder");

        Order savedOrder = orderRepo.save(order);
        assertThat(savedOrder.getId()).isNotNull();
        assertThat(savedOrder.getInvoice().getId()).isNotNull();

        log.info("Order: {}", savedOrder);
        log.info("Invoice: {}", savedOrder.getInvoice());

        log.debug("END - testOrderRepoSaveOrder");
    }
  
}
