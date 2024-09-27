package com.things.things.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.things.things.models.Temperature;

public interface TemperatureRepository extends MongoRepository<Temperature, String> {

}
