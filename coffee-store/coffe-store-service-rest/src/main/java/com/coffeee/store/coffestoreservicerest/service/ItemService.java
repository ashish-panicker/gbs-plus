package com.coffeee.store.coffestoreservicerest.service;

import java.util.List;
import java.util.Optional;

import com.coffeee.store.coffestoreservicerest.model.Item;

public interface ItemService {
    
    Item create(Item item);

    Optional<Item> findItemById(Integer id);

    List<Item> findAll();

    void delete(Integer id);

    Item update(Item item);

    
}
