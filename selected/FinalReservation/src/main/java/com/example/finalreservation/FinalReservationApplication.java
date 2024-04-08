package com.example.finalreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.example.finalreservation", "com.example.salondiscovery","com.example.serviceselect"})
@SpringBootApplication
public class FinalReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalReservationApplication.class, args);
	}

}
