package com.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {

    @GetMapping("/hello")
    public String helloWorld(Model theModel){
        theModel.addAttribute("theDate",java.time.LocalDateTime.now());
        return "helloworld";
    }
}
