package com.satyam.controller;

import com.satyam.service.IGreetings;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.PrintWriter;

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


    @GetMapping("/wish")
    public void generateWish2(HttpServletResponse response) throws IOException {
        String greeting = greetService.generateWish(" Hit Satyam");

        PrintWriter writer = response.getWriter();
        writer.println(" DevTools This Response From Controller Directly " + greeting);

    }
}