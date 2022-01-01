package com.gbsplus.colelctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeService implements GenericService<Employee> {

    private ArrayList<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public void add(Employee obj) {
        employees.add(obj);
    }

    @Override
    public void remove(Employee obj) {
        employees.remove(obj);
    }

    @Override
    public void update(Employee obj) {
        for (Employee employee : employees) {
            if (employee.getName().equals(obj.getName())) {
                employee.setName(obj.getName());
                employee.setPhone(obj.getPhone());
                employee.setEmail(obj.getEmail());
            }
        }
    }

    @Override
    public Employee get(Employee obj) {
        return employees.get(employees.indexOf(obj));
    }

    @Override
    public ArrayList<Employee> getAll() {
        return employees;
    }

    public void sortByName() {
        
        Collections.sort(employees, new NameComparator());

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        });

        Collections.sort(employees, (e1, e2) -> e1.getPhone().compareTo(e2.getPhone()));       
    }
    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}
