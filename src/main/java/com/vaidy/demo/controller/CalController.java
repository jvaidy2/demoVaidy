package com.vaidy.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController

@RequestMapping(value="/calc", produces=MediaType.APPLICATION_JSON_VALUE)
public class CalController {
    @RequestMapping("/add")
    public String greeting(@RequestParam(value="number1", defaultValue="0") String number1,
    		@RequestParam(value="number2", defaultValue="0") String number2) {
    			Integer z  =  Integer.parseInt(number1) + Integer.parseInt(number2);
    			
				return "" +z;

    }
}
