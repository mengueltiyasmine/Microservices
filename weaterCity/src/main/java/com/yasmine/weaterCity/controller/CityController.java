package com.yasmine.weaterCity.controller;

import com.yasmine.weaterCity.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping("/getCurrentConditionsWeatherByCityName/{cityName}")
    public String getCurrentConditionsWeatherByCityName(@PathVariable String cityName)
    {
        System.out.println("test");
        return cityService.getCurrentConditionsWeatherByCityName(cityName);
    }

    @GetMapping( "/getCurrentConditionsWeatherByCityCode/{locationCode}")
    public String getCurrentConditionsWeatherByCityCode(@PathVariable String locationCode)
    {
        return cityService.getCurrentConditionsWeatherByCityCode(locationCode);
    }


















}
