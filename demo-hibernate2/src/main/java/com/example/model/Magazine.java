package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @DiscriminatorValue("M")
public class Magazine extends Publication{
    
    private String editionType;

    private String coverModel;
}
