package com.things.things.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.things.things.models.Temperature;
import com.things.things.services.TemperatureService;

@RestController
public class TemperatureController {

    private TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping
    public String getRoot() {
        return "Hello World!";
    }

    @PostMapping("/temperature")
    public Temperature addTemperature(@RequestBody Temperature temperature) {
        return temperatureService.addTemperature(temperature);
    }
}
