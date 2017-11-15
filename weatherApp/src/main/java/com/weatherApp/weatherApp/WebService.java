package com.weatherApp.weatherApp;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class WebService {

    RestTemplate restTemplate;
    Weather weather;

    public Weather getWeather(String city){

        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=ef1f68a306cb1d16741c377950392df2", Weather.class);

        return weather;
    }

    public Weather getWeather(){
        return this.weather;
    }
}


