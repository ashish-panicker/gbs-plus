package com.coffeee.store.coffestoreservicerest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Item {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name = "item_name")
    private String name;

    @Column(name = "item_description")
    private String description;

    private Float price;

    private String category; // snack or beverage

    @Column(name = "item_type")
    private String type; // veg or non veg
    
    @Column(name = "item_image")
    private String image;


}
