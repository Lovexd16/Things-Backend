package com.things.things.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Temperatures")
public class Temperature {
    @Id
    private String temperatureId;
    private Double celcius;

    @CreatedDate
    private LocalDateTime timestamp;

    public Temperature(String temperatureId, Double celcius, LocalDateTime timestamp) {
        this.temperatureId = temperatureId;
        this.celcius = celcius;
        this.timestamp = timestamp;
    }

    public String getTemperatureId() {
        return temperatureId;
    }

    public void setTemperatureId(String temperatureId) {
        this.temperatureId = temperatureId;
    }

    public Double getCelcius() {
        return celcius;
    }

    public void setCelcius(Double celcius) {
        this.celcius = celcius;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}