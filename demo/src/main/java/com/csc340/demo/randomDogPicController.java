package com.csc340.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class randomDogPicController {
    private final RestTemplate restTemplate;

    public randomDogPicController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/dog-image")
    public randomDogPic getDogImage() {
        String url = "https://dog.ceo/api/breeds/image/random";
        return restTemplate.getForObject(url, randomDogPic.class);
    }
}