package com.springprac.crud.service;

import com.springprac.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
