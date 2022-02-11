package com.coffeee.store.coffestoreservicerest.repository;

import com.coffeee.store.coffestoreservicerest.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    
}
