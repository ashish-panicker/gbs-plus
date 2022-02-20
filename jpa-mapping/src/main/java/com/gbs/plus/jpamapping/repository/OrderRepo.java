package com.gbs.plus.jpamapping.repository;

import com.gbs.plus.jpamapping.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer>{
    
}
