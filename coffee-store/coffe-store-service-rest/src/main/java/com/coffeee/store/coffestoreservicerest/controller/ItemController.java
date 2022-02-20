package com.coffeee.store.coffestoreservicerest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.coffeee.store.coffestoreservicerest.model.Item;
import com.coffeee.store.coffestoreservicerest.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/v1/items")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // http://localhost:9000/api

    @GetMapping("")
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok().body(itemService.findAll());
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Integer id){
        return itemService.findItemById(id).orElseThrow();
    }

    @PostMapping("")
    public ResponseEntity<Item> createItem(@RequestBody Item item){
        var createdItem = itemService.create(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteItem(@PathVariable Integer id){
        Map<String, String> response = new HashMap();
        itemService.delete(id);
        response.put("status", "deleted");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Integer id, @RequestBody Item item) {
        
        Item itemFromDB = itemService.findItemById(id).orElseThrow();
        itemFromDB.setCategory(item.getCategory());
        itemFromDB.setDescription(item.getDescription());
        itemFromDB.setImage(item.getImage());
        itemFromDB.setName(item.getName());
        itemFromDB.setPrice(item.getPrice());
        itemFromDB.setType(item.getType());
       
        itemService.update(itemFromDB);
        return ResponseEntity.ok().body(itemFromDB);
    }
    

}
