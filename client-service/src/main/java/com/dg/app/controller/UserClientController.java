package com.dg.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserClientController {

    public static String getGreetings(String username){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8080/person/"+username;
        ResponseEntity responseEntity = rt.getForEntity(url,String.class);
        System.out.println(responseEntity.getStatusCode()+" : "+responseEntity.getStatusCodeValue() );
        return (String) responseEntity.getBody();
    }

}
