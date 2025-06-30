package com.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloWorldController {
    @RequestMapping("/show")
    public String showForm(){
        return "helloWorldForm";
    }

    @RequestMapping("/output")
    public String showHello(){
        return "helloWorldOutput";
    }

}
