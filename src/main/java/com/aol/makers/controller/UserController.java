package com.aol.makers.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aol.makers.model.Greeting;
@Component
@RestController

public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    private String authUrl = "https://i.aol.com/oauth2/token";
    
//    @Autowired
//    CustomerRepository repository;
    

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
//    @RequestMapping("/register")
//    public String register (@RequestParam(value="login") String login, 
//    		@RequestParam(value="password")String password){
//    		Customer c = new Customer("firstName", "lastName");
//    		repository.save(c);
//    		repository.save(new Customer ("Rahul", "Jayaraman"));
//    		repository.save(new Customer("Ram", "Jayaraman"));
//    		
//				return "abc";
//    	
//    }
    
    @RequestMapping("/api/register")
    public String register (@RequestParam("profileJson")UserProfile profileJson){
    	String login = profileJson.getLogin();
    	String password = profileJson.getPassword();
    	System.out.println("login = " + login + "password = "+password);
		return "abc";
    	
    }
}
