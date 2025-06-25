package com.springprac.crud.dao;

import com.springprac.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getEmployees() {
        TypedQuery<Employee> get = entityManager.createQuery("From employee",Employee.class);
        List<Employee> employees = get.getResultList();


        return employees;
    }

    @Override
    public Employee getEmployee(Integer identity) {
        Employee employee =entityManager.find(Employee.class,identity);
        return employee;
    }
}
