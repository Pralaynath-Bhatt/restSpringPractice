package com.spring.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloWorldController {
    @GetMapping("/show")
    public String showForm(){
        return "helloWorldForm";
    }

    @PostMapping("/output")
    public String showHello(HttpServletRequest request,Model model){
        String name =request.getParameter("studentName");

        name= "Yo! "+name.toUpperCase();

        model.addAttribute("studentNamef",name);

        return "helloWorldOutput";
    }

}
