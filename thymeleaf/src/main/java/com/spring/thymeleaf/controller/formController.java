package com.spring.thymeleaf.controller;

import com.spring.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class formController {

    @GetMapping("/form")
    public String form(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        return "form";
    }

    @PostMapping("result")
    public String outputForm(@ModelAttribute("student") Student theStudent){

        System.out.println("the name of the student is "+theStudent.getFirstName() +" "+theStudent.getLastName());

        return "result";
    }
}
