package com.gbs.plus.springbootmvcdemo.service;

import java.util.List;
import com.gbs.plus.springbootmvcdemo.model.entities.Person;

public interface PersonService {

    // CRUD methods for Person

    Person create(Person person);

    Person update(Person person);

    Person getById(Integer id);

    void delete(Integer id);

    // Other methods

    List<Person> findAll();

    
}
