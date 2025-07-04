package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String List(Model theModel){
        List<Employee> theEmployees= employeeService.findAll();

        theModel.addAttribute("employees", theEmployees);

        return "employees/list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Employee theEmployees= new Employee();

        theModel.addAttribute("employees", theEmployees);

        return "employees/showFormForAdd";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employees") Employee theEmployee){
        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }
}
