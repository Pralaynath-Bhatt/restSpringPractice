package com.springprac.crud.dao;

import com.springprac.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> get = entityManager.createQuery("From Employee",Employee.class);
        List<Employee> employees = get.getResultList();


        return employees;
    }

    @Override
    public Employee findEmployee(int identity) {
        Employee employee =entityManager.find(Employee.class,identity);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee employee1 = entityManager.merge(employee);
        return employee1;
    }

    @Override
    public void delete(int identity) {
        Employee employee = entityManager.find(Employee.class,identity);
        entityManager.remove(employee);
    }
}
