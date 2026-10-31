package com.satyam._1springwebmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @RequestMapping("/welcome")
    public ModelAndView displaySomeRespone() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("Message", "Hello! Welcome To Our First Web App ");
        mav.setViewName("index");
        return mav;
    }
}

