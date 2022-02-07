package com.example.service;

import java.util.List;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.create(employee);
    }

    @Override
    public Employee findById(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public void delete(Integer employeeId) {
        employeeRepository.delete(employeeId);
        
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByJobId(String jobId) {
        return employeeRepository.findByJobId(jobId);
    }
    
}
