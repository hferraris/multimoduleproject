package com.dg.app.main;

import com.dg.app.controller.UserClientController;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ClientMain
{
    @Autowired
    static UserClientController userClientController;

    public static void main( String[] args )
    {
        SpringApplication.run(ClientMain.class, args);


    }

    @Bean
    public CommandLineRunner cmdLineRunner(){
        return args -> System.out.println(userClientController.getGreetings("Geon"));

    }
}
