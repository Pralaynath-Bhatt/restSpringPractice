package com.springprac.crud.rest;

import com.springprac.crud.entity.Employee;
import com.springprac.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        Employee theEmployee= employeeService.findById(id);
        if (theEmployee==null) throw new RuntimeException("Employee ID not found - "+id);
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee employee1= employeeService.save(employee);
        return employee1;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee employee2= employeeService.save(employee);
        return employee2;
    }
    @DeleteMapping("/employees/{id}")
        public void deleteEmployee(@PathVariable int id){
            employeeService.delete(id);
    }
}
