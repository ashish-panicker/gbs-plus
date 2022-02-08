package com.gbs.plus.springbootmvcdemo.repository;

import java.util.Optional;
import com.gbs.plus.springbootmvcdemo.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This is a Spring Data JPA repository and this annotation is optional
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
