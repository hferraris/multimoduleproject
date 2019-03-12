package com.dg.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String greetings(){
        return "hello";
    }

    @GetMapping("/person/{username}")
    public String person(@PathVariable String username){
        return "hello "+ username;
    }
}
