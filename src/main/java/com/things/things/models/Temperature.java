package com.things.things.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Temperatures")
public class Temperature {
    @Id
    private String temperatureId;
    private Double celcius;

    public Temperature(String temperatureId, Double celcius) {
        this.temperatureId = temperatureId;
        this.celcius = celcius;
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

}
