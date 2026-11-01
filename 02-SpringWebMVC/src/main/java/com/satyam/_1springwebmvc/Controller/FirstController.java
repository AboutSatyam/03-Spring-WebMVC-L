package com.satyam._1springwebmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/Hit")

public class FirstController {


    @GetMapping("/welcome")
    public String displaySomeRespone2(Model model) {
        System.out.println("Model Is Internally Implemente By " + model.getClass().getName());
        model.addAttribute("info", "Hello First Controller Welcome to Spring MVC");

        return "home";
    }

    @GetMapping("/skill")
    public String displaySomeImpMsg(Model model) {
        System.out.println("Model Is Internally Implemente By " + model.getClass().getName());
        model.addAttribute("focus", " JUST WORK HARD ");
        return "focus";
    }

    @GetMapping("/info")
    public String displaySomeImpInfo(Map<String, Object> map) {
        System.out.println(map.getClass().getName());
        map.put("info", "Using Map Paramter ");
        return "Map_JSP";
    }

}
