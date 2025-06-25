package com.springprac.crud.dao;

import com.springprac.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findEmployee(Integer identity);


}
