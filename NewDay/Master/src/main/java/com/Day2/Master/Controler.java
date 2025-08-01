package com.Day2.Master;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping
@RestController

public class Controler {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/user")
    public String userEndpoint(){
        return "hello from user";
    }
    @GetMapping("/admin")
    public String adminEndpoint(){
        return "hello from admin";
    }
}
