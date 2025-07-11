package com.springtutorial.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
@GetMapping("/")
    public String Home(){
    return "home";
}
    @GetMapping("/employee")
    public String Employee(){
        return "employee";
    }
    @GetMapping("/manager")
    public String Employ(){
        return "manager";
    }
    @GetMapping("/admin")
    public String Employer(){
        return "admin";
    }
@GetMapping("/showLoginPage")
    public  String showMyLoginPage(){
    return "fancy-login";
}

    @GetMapping("/access-Denied")
    public  String showAccessDeniedPage(){
        return "access-Denied";
    }
}
