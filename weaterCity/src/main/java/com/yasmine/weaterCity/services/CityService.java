package com.yasmine.weaterCity.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class CityService {

    RestTemplate restTemplate= new RestTemplate();
    String apiKey="6U9lVTmhkZ5A7qQcgUQgIDPb0PQhftue";
    String apiWebsite="http://dataservice.accuweather.com/";


    ///City Search

    public String CitySearchByName(String cityname){
        return  restTemplate.exchange
                (apiWebsite+"locations/v1/cities/search?apikey="+apiKey+"&q={cityname}&language=fr-fr&details=false",
                        HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, cityname).getBody();
    }


    public int getCitykey(String cityname)
    {
        int citykey = -1;
        String cityInfo=CitySearchByName(cityname);
        String   response = cityInfo.substring(1, cityInfo.length() -1);

        try {
            JSONObject jsonResponse = new JSONObject(response);
            citykey = jsonResponse.getInt("Key");
        }catch (JSONException err){
            System.out.println("Error while getting data");
        }

        return citykey;
    }



    public String getCurrentConditionsWeatherByCityCode(@PathVariable String locationCode)
    {
        String response = restTemplate.exchange(apiWebsite+"currentconditions/v1/{locationCode}?apikey="+apiKey+"&language=fr-fr&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, locationCode).getBody();
        return response;
    }



    public String getCurrentConditionsWeatherByCityName(@PathVariable String cityName)
    {
        int cityKey = this.getCitykey(cityName);

        String response = restTemplate.exchange(apiWebsite+"currentconditions/v1/{cityKey}?apikey="+apiKey+"&language=fr-fr&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, cityKey).getBody();
        return response;
    }


    public String get1HourHourlyForecasts(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"forecasts/v1/hourly/1hour/{citykey}?apikey="+apiKey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;
    }

    public String get12HourHourlyForecasts(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"forecasts/v1/hourly/12hour/{citykey}?apikey="+apiKey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;
    }




    public String get1DayDailyForecasts(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"forecasts/v1/daily/1day/{citykey}?apikey="+apiKey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }

    public String get5DayDailyForecasts(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"forecasts/v1/daily/5day/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }


    public String get10DayDailyForecasts(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"forecasts/v1/daily/10sday/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }



    public String get1DayOfWeatherAlarms(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"alarms/v1/1day/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }


    public String get5DayOfWeatherAlarms(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"alarms/v1/5day/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }


    public String get10DayOfWeatherAlarms(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"alarms/v1/10day/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }

    public String get15DayOfWeatherAlarms(String cityName)
    {
        int citykey = this.getCitykey(cityName);
        String response = restTemplate.exchange(apiWebsite+"alarms/v1/15day/{citykey}?apikey="+citykey+"&language=en-us&details=false",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, citykey).getBody();
        return response;

    }









}
