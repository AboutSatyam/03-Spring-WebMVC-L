package com.satyam.controller;

import com.satyam.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class courseController {

    @GetMapping("/courseinfo")
    public String getCourseInfo(Model model) {

        model.addAttribute("cid", "SpringBoot");
        model.addAttribute("cname", "DEVOPS");
        model.addAttribute("price", "4999 INR");
        return "course";
    }

    @GetMapping("/coursedetail")
    public String getCourseDetails(Model model) {

        Course course = new Course();


        course.setCid(1);
        course.setCname("Satyam Broo");
        course.setPrice(599.5);
        model.addAttribute("course", course);
        return "courseinfo";
    }

}
