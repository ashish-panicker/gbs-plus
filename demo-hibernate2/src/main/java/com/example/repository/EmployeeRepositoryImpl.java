package com.example.repository;

import java.util.List;
import com.example.model.Employee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeRepositoryImpl implements EmployeeRepository {


    @Override
    public Employee create(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(employee);
            tx.commit();
        }
        return employee;
    }

    @Override
    public Employee findById(Integer employeeId) {
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employee = session.get(Employee.class, employeeId);
        }
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(employee);
            tx.commit();
        }
        return employee;
    }

    @Override
    public void delete(Integer employeeId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Employee employee = session.get(Employee.class, employeeId);
            session.delete(employee);
            tx.commit();
        }
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees = session.createQuery("from Employee", Employee.class).getResultList();
        }
        return employees;
    }

    @Override
    public List<Employee> findByJobId(String jobId) {
        List<Employee> employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees = session.createQuery("from Employee where jobId = :userJobId", Employee.class)    
                            .setParameter("userJobId", jobId)
                            .getResultList();
        }
        return employees;
    }


    @Override
    public List<Employee> findByFirstNameAndLastName(String firstName, String lastName) {
        List<Employee> employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees = session.createQuery("from Employee where firstName = :fname and lastName = :lname", 
                                        Employee.class)    
                            .setParameter("fname", firstName)
                            .setParameter("lname", lastName)
                            .getResultList();
        }
        return employees;
    }

}
