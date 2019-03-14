package com.dg.app;

import com.dg.app.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@Import(UserController.class)
public class ServiceMain
{
    public static Logger logger = LoggerFactory.getLogger(ServiceMain.class);
    public static void main (String[] args){
        SpringApplication.run(ServiceMain.class, args);
    }

   /* @Bean
    public CommandLineRunner cmdLineRunner(ApplicationContext ctx){
        logger.info("Service test : geon");
        return args -> System.out.println("ctx.getApplicationName() = " + ctx.getDisplayName());

    }*/
}
