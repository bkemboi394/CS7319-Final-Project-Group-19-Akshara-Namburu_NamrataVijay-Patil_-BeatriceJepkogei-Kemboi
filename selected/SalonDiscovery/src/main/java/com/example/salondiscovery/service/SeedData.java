package com.example.salondiscovery.service;

import com.example.salondiscovery.entity.Salon;
import com.example.salondiscovery.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class SeedData {

    private final SalonRepository salonRepository;

    @Autowired
    public SeedData(SalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    @PostConstruct
    public void init() {
        // Check if the database is already populated
        if (salonRepository.count() == 0) {
            List<Salon> salons = List.of(
                    new Salon()
                    // Add more salon records as needed
            );

            salonRepository.saveAll(salons);
        }
    }
}
