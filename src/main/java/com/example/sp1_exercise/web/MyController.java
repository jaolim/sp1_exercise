package com.example.sp1_exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/index")
    @ResponseBody
    public String returnIndex() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String returnContact() {
        return "This is the contact page";
    }

}
