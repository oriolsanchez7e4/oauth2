package com.example.springoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringOauth2Application {

    @GetMapping
    public String welcome(){
        return "Welcome to Google!!";
    }

    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("username: " + principal.getName());
        return principal;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2Application.class, args);
    }

}
