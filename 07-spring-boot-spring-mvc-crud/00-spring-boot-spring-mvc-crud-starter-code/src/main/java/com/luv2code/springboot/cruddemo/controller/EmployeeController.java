package com.luv2code.springboot.cruddemo.controller;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/showFormForUpdate")
    public String save(@RequestParam("employeeId") int theId,Model theModel){
        Employee theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employees",theEmployee);
        return "employees/showFormForAdd";
    }
}
