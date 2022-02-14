package com.example.distancecalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(){
        return "Hello from Test endpoint!";
    }
}
