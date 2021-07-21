package com.tts.WeatherApp;



import org.springframework.beans.factory.annotation.Value;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${api_key}")
    private String apiKey;

    private ZipCodeRepository repository;


    public Response getForecast(String zipCode) {
        String url = "https://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        //add the
        restTemplate.getForEntity(url, ZipCode.class);


        return restTemplate.getForObject(url, Response.class);
    }

}
