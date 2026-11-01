package com.satyam._1springwebmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    @RequestMapping("/Hit2")
    public class SecondController {


        @GetMapping("/welcome")
        public String displaySomeRespone2(Model model) {
            System.out.println("Model Is Internally Implemente By " + model.getClass().getName());
            model.addAttribute("info", "Second Controller ! Welcome to Spring MVC");

            return "home";
        }
    }

