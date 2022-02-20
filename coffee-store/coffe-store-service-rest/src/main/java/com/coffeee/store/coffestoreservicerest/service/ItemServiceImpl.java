package com.coffeee.store.coffestoreservicerest.service;

import java.util.List;
import java.util.Optional;

import com.coffeee.store.coffestoreservicerest.model.Item;
import com.coffeee.store.coffestoreservicerest.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Optional<Item> findItemById(Integer id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> findAll() {
       return itemRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        itemRepository.deleteById(id);
    }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }
    
    
}
