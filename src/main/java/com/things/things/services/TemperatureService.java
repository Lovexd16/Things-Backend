package com.things.things.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.things.things.models.Temperature;
import com.things.things.repository.TemperatureRepository;

@Service
public class TemperatureService {
    private final MongoOperations mongoOperations;
    private final TemperatureRepository temperatureRepository;

    public TemperatureService(MongoOperations mongoOperations, TemperatureRepository temperatureRepository) {
        this.mongoOperations = mongoOperations;
        this.temperatureRepository = temperatureRepository;
    }

    public List<Temperature> getTemperatures() {
        return mongoOperations.findAll(Temperature.class);
    }

    public Temperature addTemperature(Temperature temperature) {
        return mongoOperations.insert(temperature);
    }

    @Scheduled(cron = "0 0 0 * * MON")
    public void clearTemperatures() {
        temperatureRepository.deleteAll();
        System.out.println("Ny vecka! Alla temperaturer rensades.");
    }

}
