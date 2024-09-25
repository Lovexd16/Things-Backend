package com.things.things.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.things.things.models.Temperature;

@Service
public class TemperatureService {
    private final MongoOperations mongoOperations;

    public TemperatureService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<Temperature> getTemperatures() {
        return mongoOperations.findAll(Temperature.class);
    }

    public Temperature addTemperature(Temperature temperature) {
        return mongoOperations.insert(temperature);
    }

}
