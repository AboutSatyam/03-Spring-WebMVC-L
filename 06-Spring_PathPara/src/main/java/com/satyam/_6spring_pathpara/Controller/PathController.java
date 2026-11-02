package com.satyam._6spring_pathpara.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathController {

    //  http://localhost:8080/CourseApp/getinfo/Satyam

    //  http://localhost:8080/CourseApp/getinfo/Satyam/Devops/9999
    @GetMapping("getinfo/{name}/{course}")
    public String getSomeInfo(@PathVariable("name") String n, @PathVariable("course") String c, Map<String, Object> model) {
        String info = " Hello  " + n + " Welcome Backk!! in " + c + " Course";
        model.put("msg", info);

        return "home";
    }

}
