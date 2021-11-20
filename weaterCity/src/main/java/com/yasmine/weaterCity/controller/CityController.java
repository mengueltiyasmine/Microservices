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

        return cityService.getCurrentConditionsWeatherByCityName(cityName);
    }

    @GetMapping( "/getCurrentConditionsWeatherByCityCode/{locationCode}")
    public String getCurrentConditionsWeatherByCityCode(@PathVariable String locationCode)
    {
        return cityService.getCurrentConditionsWeatherByCityCode(locationCode);
    }


    @GetMapping( "/get1HourHourlyForecastsByName/{cityName}")
    public String get1HourHourlyForecasts(@PathVariable String cityName)
    {
        return cityService.get1HourHourlyForecasts(cityName);
    }

    @GetMapping( "/get12HourHourlyForecastsByName/{cityName}")
    public String get12HourHourlyForecasts(@PathVariable String cityName)
    {
        return cityService.get12HourHourlyForecasts(cityName);
    }

    @GetMapping( "/get1DayDailyForecastsByName/{cityName}")
    public String get1DayDailyForecasts(@PathVariable String cityName)
    {
        return cityService.get1DayDailyForecasts(cityName);
    }

    @GetMapping( "/get5DayDailyForecastsByName/{cityName}")
    public String get5DayDailyForecasts(@PathVariable String cityName)
    {
        return cityService.get5DayDailyForecasts(cityName);
    }


















}
