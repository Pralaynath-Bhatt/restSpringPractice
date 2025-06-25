package com.springprac.crud.rest;

import com.springprac.crud.dao.EmployeeDAO;
import com.springprac.crud.dao.EmployeeDAOimpl;
import com.springprac.crud.entity.Employee;
import com.springprac.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {
    private EmployeeService employeeService;

    @Autowired
    public restController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
