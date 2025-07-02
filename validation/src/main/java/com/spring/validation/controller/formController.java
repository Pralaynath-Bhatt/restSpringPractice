package com.spring.validation.controller;

import com.spring.validation.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class formController {

    @InitBinder
    public void preProcessor(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/form")
    public String getForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "form";
    }

    @PostMapping("/result")
    public String getResult(@Valid @ModelAttribute("customer")Customer newCustomer, BindingResult theBindingResult){
        if (theBindingResult.hasErrors())
            return "form";
        else
            return "result";

    }
}
