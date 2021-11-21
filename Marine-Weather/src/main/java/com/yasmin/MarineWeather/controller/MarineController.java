package com.yasmin.MarineWeather.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarineController {

    @GetMapping("/")
    public String home()
    {
        return "In Consctruction" ;
    }
}
