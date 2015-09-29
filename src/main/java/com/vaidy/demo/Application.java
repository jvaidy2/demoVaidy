package com.vaidy.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.vaidy.demo")
@SpringBootApplication
public class Application  {

    public static void main(String[] args)  {
    	System.out.println("hello world");
        SpringApplication.run(Application.class, args);
    }
}