package com.springprac.crud.dao;

import com.springprac.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findEmployee(int identity);

    Employee save(Employee employee);

    void delete(int identity);
}
