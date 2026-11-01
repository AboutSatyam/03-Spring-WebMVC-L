package com.satyam.controller;

import com.satyam.service.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    private IGreetings greetService;

    @GetMapping("/greet")
    public String generateWish(Model model) {
        String greeting = greetService.generateWish("Satyam");
        model.addAttribute("wish", greeting);
        return "greeting";
    }
}