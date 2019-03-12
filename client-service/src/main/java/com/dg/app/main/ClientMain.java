package com.dg.app.main;

import com.dg.app.controller.UserClientController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
        System.out.println(getGreetings());

    }
    public static String getGreetings(){
        return userClientController.getGreetings("Geon");
    }
}
