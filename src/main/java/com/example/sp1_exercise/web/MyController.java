package com.example.sp1_exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/hello")
    @ResponseBody
    public String returnHello(
        @RequestParam String location,
        @RequestParam String name
    ) {
        return "Welcome to the " + location + " " + name + "!";
    }

}
