package com.example.salondiscovery.controller;

import com.example.salondiscovery.entity.Salon;
import com.example.salondiscovery.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalonController {

    private final SalonService salonService;

    @Autowired
    public SalonController(SalonService salonService) {
        this.salonService = salonService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/salons")
    public List<Salon> getSalonsByZipCode(@RequestParam String zipCode) {
        return salonService.getSalonsByZipCode(zipCode);
    }
    @DeleteMapping("/salons")
    public ResponseEntity<String> deleteAllSalons() {
        salonService.deleteAllSalons();
        return ResponseEntity.ok("All salons deleted successfully.");
    }
}

