package com.things.things;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ThingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThingsApplication.class, args);
	}

}
