package com.satyam._1springwebmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)

    public ModelAndView displaySomeRespone() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("Message", "Hello! Welcome To Our First Web App ");
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/welcome2")
    public ModelAndView displaySomeRespone2() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("Message", "Hello! DAY 2  Welcome To Second Day Oof Learning ");
        mav.setViewName("index");
        return mav;
    }
}

