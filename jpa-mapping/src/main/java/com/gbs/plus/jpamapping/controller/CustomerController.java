package com.gbs.plus.jpamapping.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.gbs.plus.jpamapping.model.Address;
import com.gbs.plus.jpamapping.model.Customer;
import com.gbs.plus.jpamapping.model.Invoice;
import com.gbs.plus.jpamapping.model.Order;
import com.gbs.plus.jpamapping.repository.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @Autowired 
    private CustomerRepo customerRepo;

    private Customer customer;
    private Address workAddress;
    private Address homeAddress;
    private Order order1;
    private Order order2;
    private Invoice invoice1;
    private Invoice invoice2;
    
    @PostMapping("/customers")
    public ResponseEntity<Map<Object, Object>> createCustomer() {

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

        order1.setCustomer(customer);
        order2.setCustomer(customer);

        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

        Customer savedCustomer = customerRepo.save(customer);

        Map<Object, Object> response = new HashMap();
        response.put("status", HttpStatus.CREATED);
        // response.put("customer", savedCustomer);
        savedCustomer.getOrders().forEach(order -> {
            response.put("order - " + order.getId(), order.getCustomer());
        });

        return new ResponseEntity<>(response, HttpStatus.CREATED);
        
    }
}
