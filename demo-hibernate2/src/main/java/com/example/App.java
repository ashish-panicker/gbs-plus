package com.example;

import java.time.LocalDate;
import com.example.model.Book;
import com.example.model.Employee;
import com.example.model.Magazine;
import com.example.model.Publication;
import com.example.repository.EmployeeRepository;
import com.example.repository.EmployeeRepositoryImpl;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 */
public final class App {
    private App() {}

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        Book killingFloor = new Book();
        killingFloor.setAuthor("Lee Child");
        killingFloor.setGenre("Thriller");
        killingFloor.setPublishedDate(LocalDate.of(2005, 1, 1));


        Magazine vouge = new Magazine();
        vouge.setPublishedDate(LocalDate.now());
        vouge.setEditionType("Christmas");
        vouge.setCoverModel("Hard");


        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            session.save(killingFloor);
            session.save(vouge);
            session.getTransaction().commit();
        }



    }

    public static void employeeTest() {
        System.out.println("Hello World!");

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);

        // employeeRepository.findAll().forEach(e -> System.out.println(e));
        employeeService.findByJobId("IT_PROG").forEach(e -> System.out.println(e));

        // Employee empJohn = new Employee("John", "Doe", "john.doe", "1234567890", LocalDate.now(),
        // "IT_PROG", 10000.0, 0.0, 1);

        // Employee empJane = new Employee("Jane", "Doe", "jane.doe", "1234567890", LocalDate.now(),
        // "SA_REP", 8000.0, 2.5, 10);

        // Employee empMary = new Employee("Mary", "Doe", "mary.doe", "1234567890", LocalDate.now(),
        // "INV_CLRK", 7000.0, 1.0, 15);

        // employeeService.create(empJohn);
        // employeeService.create(empJane);
        // employeeService.create(empMary);
    }
}
