package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {

    private String yourFavColor = "Pink"; 
    @GetMapping("get")
    public String getMyFav() {
        return "My favorite color is " + yourFavColor;
    }
}
