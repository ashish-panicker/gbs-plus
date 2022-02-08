package com.gbs.plus.springbootmvcdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbs.plus.springbootmvcdemo.model.entities.Person;
import com.gbs.plus.springbootmvcdemo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getById(Integer id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        personRepository.deleteById(id);   
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    
}
