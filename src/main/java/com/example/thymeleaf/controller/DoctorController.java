package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public void doctor(Model model,
                       @RequestParam (required=false, defaultValue="0") int number,
                       @RequestParam(required=false, defaultValue="John Smith") String name) {
        model.addAttribute("name", name);
        model.addAttribute("number", number);
    }
}
