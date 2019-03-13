package com.dg.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public static Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/")
    public String greetings(){
        return "hello";
    }

    @GetMapping("/person/{username}")
    public String person(@PathVariable String username){
        logger.info("Person : {}", username);
        return "hello "+ username;
    }
}
