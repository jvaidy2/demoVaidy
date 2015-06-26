package com.aol.makers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.aol.makers")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args)  {
    	System.out.println("hello world");
        SpringApplication.run(Application.class, args);
    }
}