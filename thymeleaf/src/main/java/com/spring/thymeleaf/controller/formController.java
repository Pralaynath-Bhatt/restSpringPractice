package com.spring.thymeleaf.controller;

import com.spring.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class formController {
    @Value("${country}")
    public List<String> countries;
    @Value("${language}")
    public List<String> languages;
    @Value("${systems}")
    public List<String> systems;


    @GetMapping("/form")
    public String form(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        theModel.addAttribute("countries",countries);
        theModel.addAttribute("languages",languages);
        theModel.addAttribute("systems",systems);

        return "form";
    }

    @PostMapping("result")
    public String outputForm(@ModelAttribute("student") Student theStudent){

        System.out.println("the name of the student is "+theStudent.getFirstName() +" "+theStudent.getLastName());

        System.out.println("the name of the country is "+theStudent.getCountry());

        return "result";
    }
}
