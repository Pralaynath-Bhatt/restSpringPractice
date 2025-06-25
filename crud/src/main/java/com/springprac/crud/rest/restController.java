package com.springprac.crud.rest;

import com.springprac.crud.entity.Employee;
import com.springprac.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id}")
    public Employee findEmployee(@PathVariable int id){
        Employee theEmployee= employeeService.findEmployee(id);
        if (theEmployee==null) throw new RuntimeException("Employee ID not found - "+id);
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(Employee employee){
        Employee employee1= employeeService.save(employee);
        return employee1;
    }

    @PatchMapping("/employees")
    public Employee updateEmployee(Employee employee){
        Employee employee1= employeeService.save(employee);
        return employee1;
    }
    @DeleteMapping("/employees/{id}")
        public void deleteEmployee(@PathVariable int id){
            employeeService.delete(id);
    }
}
