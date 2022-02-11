package com.coffeee.store.coffestoreservicerest.controller;

import java.util.List;

import com.coffeee.store.coffestoreservicerest.model.Item;
import com.coffeee.store.coffestoreservicerest.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    // http://localhost:9000/api/items

    @GetMapping(value="/items")
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok().body(itemService.findAll());
    }

    @GetMapping("/items/{id}")
    public Item getItemById(@PathVariable Integer id){
        return itemService.findItemById(id).orElseThrow();
    }
    

}
