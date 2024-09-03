package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController {

    // http://localhost:8080/public
    @GetMapping("/public")
    public String getPublicMessage(){
        return "This is from public api";
    }

    // http://localhost:8080/private
    @GetMapping("/private")
    public String getPrivateMessage(){
        return "This is from private api";
    }


}
