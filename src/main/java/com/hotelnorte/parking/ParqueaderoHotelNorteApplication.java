package com.hotelnorte.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hotelnorte.parking.repository")
@EntityScan(basePackages = "com.hotelnorte.parking.entity")
public class ParqueaderoHotelNorteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoHotelNorteApplication.class, args);
	}

}
