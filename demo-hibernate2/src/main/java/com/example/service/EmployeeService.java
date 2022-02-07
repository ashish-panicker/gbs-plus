package com.example.service;

import java.util.List;
import com.example.model.Employee;

public interface EmployeeService {

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
    
}
