package com.example.salondiscovery.service;

import com.example.salondiscovery.entity.Salon;
import com.example.salondiscovery.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SalonService {

    private final SalonRepository salonRepository;

    @Autowired
    public SalonService(SalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    public List<Salon> getSalonsByZipCode(String zipCode) {
        return salonRepository.findByZipCode(zipCode);
    }

    @Transactional
    public void deleteAllSalons() {
        salonRepository.deleteAll();
    }
}

