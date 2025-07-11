package com.springtutorial.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
@GetMapping("/hii")
    public String Home(){
    return "home";
}
@GetMapping("/showLoginPage")
    public  String showMyLoginPage(){
    return "fancy-login";
}


}
