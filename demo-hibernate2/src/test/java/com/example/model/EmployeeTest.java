package com.example.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Employee Model class Test")
public class EmployeeTest {

    @DisplayName("Test Employee Model class")
    @Test
    public void testEmployee() {
        Employee emp = new Employee();
        emp.setEmployeeId(1);
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.setEmail("john.doe");
        emp.setHireDate(LocalDate.now());
        emp.setJobId("IT_PROG");
        emp.setSalary(10000.0);
        emp.setCommissionPct(0.0);
        emp.setDepartmentId(1);
        assertAll("employee model", 
            () -> assertEquals(1, emp.getEmployeeId()),
            () -> assertEquals("John", emp.getFirstName()),
            () -> assertEquals("Doe", emp.getLastName()),
            () -> assertEquals("john.doe", emp.getEmail()),
            () -> assertEquals(LocalDate.now(), emp.getHireDate()),
            () -> assertEquals("IT_PROG", emp.getJobId()),
            () -> assertEquals(10000.0, emp.getSalary()),
            () -> assertEquals(0.0, emp.getCommissionPct()),
            () -> assertEquals(1, emp.getDepartmentId())
        );
    }
    
}
