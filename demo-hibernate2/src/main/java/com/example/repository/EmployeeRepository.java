package com.example.repository;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeRepository {

    // CRUD operations on Employee class

    // Create
    Employee create(Employee employee);

    // Read
    Employee findById(Integer employeeId);

    // Update
    Employee update(Employee employee);

    // Delete
    void delete(Integer employeeId);

    List<Employee> findAll();

    List<Employee> findByJobId(String jobId);

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
    
}
