package com.gbs.plus.jpamapping.repository;

import com.gbs.plus.jpamapping.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}