package com.springprac.crud.service;

import com.springprac.crud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int identity);
    Employee save(Employee employee);

    void delete(int identity);
}
