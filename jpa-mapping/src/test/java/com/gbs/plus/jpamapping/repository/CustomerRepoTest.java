package com.gbs.plus.jpamapping.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.gbs.plus.jpamapping.model.Customer;
import com.gbs.plus.jpamapping.model.Invoice;
import com.gbs.plus.jpamapping.model.Order;
import com.gbs.plus.jpamapping.model.Address;

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
public class CustomerRepoTest {
    

    @Autowired 
    private CustomerRepo customerRepo;

    private Customer customer;
    private Address workAddress;
    private Address homeAddress;
    private Order order1;
    private Order order2;
    private Invoice invoice1;
    private Invoice invoice2;

    @BeforeEach
    public void setUp() {
        
        invoice1 = new Invoice();
        invoice2 = new Invoice();
        
        order1 = new Order();
        order2 = new Order();

        workAddress = new Address();
        homeAddress = new Address();

        workAddress.setStreet("123 Main St");
        workAddress.setCity("Anytown");
        workAddress.setState("CA");
        workAddress.setZip("12345");


        homeAddress.setStreet("456 Elm St");
        homeAddress.setCity("Anytown");
        homeAddress.setState("CA");
        homeAddress.setZip("54321");

        customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("j.doe");
        customer.setWorkAddress(workAddress);
        customer.setHomeAddress(homeAddress);


        order1.setOrderDate(LocalDate.now());
        order1.setTotal(100.00);

        order2.setOrderDate(LocalDate.now());
        order2.setTotal(200.00);

        invoice1.setDueDate(LocalDate.of(2022, 04, 15));
        invoice1.setInvoiceDate(LocalDate.now());
        invoice1.setTotalDue(100.00);
        invoice1.setTotalPaid(0.00);

        invoice2.setDueDate(LocalDate.of(2022, 04, 15));
        invoice2.setInvoiceDate(LocalDate.now());
        invoice2.setTotalDue(200.00);
        invoice2.setTotalPaid(0.00);

        order1.setInvoice(invoice1);
        invoice1.setOrder(order1);

        order2.setInvoice(invoice2);
        invoice2.setOrder(order2);

        Set<Order> orders = new HashSet<>();
        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

    }


    @Test
    @DisplayName("Testing to check if CustomerRepo is not null")
    public void testCustomerRepoIsNotNull(){
        assertThat(customerRepo).isNotNull();
        assertNotNull(customerRepo);
    }

    @Test
    @DisplayName("Testing to check if CustomerRepo saves the record of customer and addresses")
    public void testCustomerRepoSaveCustomer(){

        log.debug("BEGIN - testCustomerRepoSaveCustomer");
        
        Customer savedCustomer = customerRepo.save(customer);

        log.info("Customer: {}", savedCustomer);
        log.info("Work Address: {}", savedCustomer.getWorkAddress());
        log.info("Home Address: {}", savedCustomer.getHomeAddress());

        assertNotNull(savedCustomer.getId());
        assertNotNull(savedCustomer.getWorkAddress().getId());
        assertNotNull(savedCustomer.getHomeAddress().getId());
        assertThat(savedCustomer.getOrders()).isNotEmpty();

        savedCustomer.getOrders().forEach(order -> {
            log.info("------ Order: {}", order);
            log.info("------ Invoice: {}", order.getInvoice());
        });

        log.debug("END - testCustomerRepoSaveCustomer");
    }
   
}
