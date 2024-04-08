package com.example.salondiscovery.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "salon-service", url = "http://localhost:8081")
public interface SalonClient<SalonDto> {
    @GetMapping("/salons/{id}")
    SalonDto getSalonById(@PathVariable("id") Long id);
}
