package com.dg.app.main;

import com.dg.app.controller.UserController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import(UserController.class)
public class ServiceMain
{
    public static void main (String[] args){
        SpringApplication.run(ServiceMain.class, args);
    }

    @Bean
    public CommandLineRunner cmdLineRunner(ApplicationContext ctx){
        return args -> System.out.println("ctx.getApplicationName() = " + ctx.getDisplayName().toString());

    }
}
