package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.List;
import com.example.model.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@DisplayName("EmployeeRepositoryImpl Tests")
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class EmployeeRepositoryTest {

    private static EmployeeRepository employeeRepository;
    private Employee empUserData;
    private Employee empRetrieved;

    private static Integer empId;


    @BeforeAll
    public static void setUpClass() {
        System.out.println("@BeforeAll - EmployeeRepositoryTest");
        employeeRepository = new EmployeeRepositoryImpl();
    }

    @BeforeEach
    public void setUp() {
        System.out.println("EmployeeRepositoryImplTest.setUp()");
        empUserData = new Employee("John", "Doe", "john.doe", "1234567890", LocalDate.now(),
                "IT_PROG", 10000.0, 0.0, 1);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("EmployeeRepositoryImplTest.tearDown()");
        empUserData = null;
        empRetrieved = null;
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("@AfterAll - EmployeeRepositoryTest");
        employeeRepository = null;
    }

    @Test
    @Order(1)
    @DisplayName("Test EmployeeRepository.create()")
    public void shouldCreateEmployee() {
        empRetrieved = employeeRepository.create(empUserData);
        empId = empRetrieved.getEmployeeId();
        assertNotNull(empRetrieved.getEmployeeId());
    }

    @Test
    @Order(2)
    @DisplayName("Test EmployeeRepository.findById()")
    public void shouldFindEmployeeById() {
        empRetrieved = employeeRepository.findById(empId);
        assertNotNull(empRetrieved);
    }

    @Test
    @Order(3)
    @DisplayName("Test EmployeeRepository.update()")
    public void shouldUpdateEmployee() {
        empUserData = employeeRepository.findById(empId);
        empUserData.setLastName("Smith");
        empRetrieved = employeeRepository.update(empUserData);
        assertEquals("Smith", empRetrieved.getLastName());
    }


    @Test
    @Order(4)
    @DisplayName("Test EmployeeRepository.findAll()")
    public void shouldFindAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        assertTrue(employees.size() > 0);
    }

    @Test
    @Order(5)
    @DisplayName("Test EmployeeRepository.findByJobId()")
    public void shouldFindEmployeeByJobId() {
        List<Employee> employees = employeeRepository.findByJobId("IT_PROG");
        assertTrue(employees.size() > 0);
    }

    @Test
    @Order(6)
    @DisplayName("Test EmployeeRepository.findByLastName()")
    public void shouldFindEmployeeByLastName() {
        List<Employee> employees = employeeRepository.findByFirstNameAndLastName("John", "Doe");
        assertTrue(employees.size() > 0);
    }

    @Test
    @Order(7)
    @DisplayName("Test EmployeeRepository.delete()")
    public void shouldDeleteEmployee() {
        employeeRepository.delete(empId);
        empRetrieved = employeeRepository.findById(empId);
        assertNull(empRetrieved);
    }
}
