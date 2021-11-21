package com.yasmine.weaterCity.controller;

import com.yasmine.weaterCity.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="Weather controller")

@RestController
public class CityController {

    @Autowired
    CityService cityService;


    @ApiOperation(value = "Get Weather by city Name ", response = CityController.class, tags = "getCurrentConditionsWeatherByCityName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping("/getCurrentConditionsWeatherByCityName/{cityName}")
    public String getCurrentConditionsWeatherByCityName(@PathVariable String cityName)
    {

        return cityService.getCurrentConditionsWeatherByCityName(cityName);
    }



    @ApiOperation(value = "Get Weather by city Code  ", response = CityController.class, tags = "getCurrentConditionsWeatherByCityCode")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/getCurrentConditionsWeatherByCityCode/{locationCode}")
    public String getCurrentConditionsWeatherByCityCode(@PathVariable String locationCode)
    {
        return cityService.getCurrentConditionsWeatherByCityCode(locationCode);
    }



    @ApiOperation(value = "Get 1 hour Forecasts by Name of the city   ", response = CityController.class, tags = "get1HourHourlyForecastsByName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get1HourHourlyForecastsByName/{cityName}")
    public String get1HourHourlyForecasts(@PathVariable String cityName)
    {
        return cityService.get1HourHourlyForecasts(cityName);
    }



    @ApiOperation(value = "Get 12 hour Forecasts by Name of the city   ", response = CityController.class, tags = "get12HourHourlyForecastsByName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get12HourHourlyForecastsByName/{cityName}")
    public String get12HourHourlyForecasts(@PathVariable String cityName)
    {
        return cityService.get12HourHourlyForecasts(cityName);
    }





    @ApiOperation(value = "Get 1 day  Forecasts by Name of the city   ", response = CityController.class, tags = "get1DayDailyForecastsByName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get1DayDailyForecastsByName/{cityName}")
    public String get1DayDailyForecasts(@PathVariable String cityName)
    {
        return cityService.get1DayDailyForecasts(cityName);
    }



    @ApiOperation(value = "Get 5 day  Forecasts by Name of the city   ", response = CityController.class, tags = "get5DayDailyForecastsByName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get5DayDailyForecastsByName/{cityName}")
    public String get5DayDailyForecasts(@PathVariable String cityName)
    {
        return cityService.get5DayDailyForecasts(cityName);
    }




    @ApiOperation(value = "Get 1 day  of Weather Alarm by Name of the city   ", response = CityController.class, tags = "get1DayOfWeatherAlarms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get1DayOfWeatherAlarmsByName/{cityName}")
    public String get1DayOfWeatherAlarms(@PathVariable String cityName)
    {
        return cityService.get1DayOfWeatherAlarms(cityName);
    }


    @ApiOperation(value = "Get 5 day  of Weather Alarm by Name of the city   ", response = CityController.class, tags = "get5DayOfWeatherAlarms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get5DayOfWeatherAlarmsByName/{cityName}")
    public String get5DayOfWeatherAlarms(@PathVariable String cityName)
    {
        return cityService.get5DayOfWeatherAlarms(cityName);
    }


    @ApiOperation(value = "Get 10 day  of Weather Alarm by Name of the city   ", response = CityController.class, tags = "get10DayOfWeatherAlarms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get10DayOfWeatherAlarmsByName/{cityName}")
    public String get1ODayOfWeatherAlarms(@PathVariable String cityName)
    {
        return cityService.get10DayOfWeatherAlarms(cityName);
    }

    @ApiOperation(value = "Get 15 day  of Weather Alarm by Name of the city   ", response = CityController.class, tags = "get15DayOfWeatherAlarms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully "),
            @ApiResponse(code = 401, message = " Not authorized"),
            @ApiResponse(code = 403, message = "Access forbidden"),
            @ApiResponse(code = 404, message = "Page not found")
    }
    )
    @GetMapping( "/get15DayOfWeatherAlarmsByName/{cityName}")
    public String get15DayOfWeatherAlarms(@PathVariable String cityName)
    {
        return cityService.get15DayOfWeatherAlarms(cityName);
    }





}
