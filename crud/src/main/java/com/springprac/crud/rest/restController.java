package com.springprac.crud.rest;

import com.springprac.crud.dao.EmployeeDAO;
import com.springprac.crud.dao.EmployeeDAOimpl;
import com.springprac.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {
    private EmployeeDAO employeeDAO;

    @Autowired
    public restController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        List<Employee> employees = employeeDAO.findAll();
        return employees;
    }
}
