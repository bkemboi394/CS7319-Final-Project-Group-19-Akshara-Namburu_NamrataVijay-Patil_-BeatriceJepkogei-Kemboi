package com.example.serviceselect.service;


import com.example.serviceselect.entity.SalonService;
import com.example.serviceselect.repository.SalonServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalonServicesService {

    private final SalonServiceRepository repository;

    @Autowired
    public SalonServicesService(SalonServiceRepository repository) {
        this.repository = repository;
    }

    public List<SalonService> findBySalonId(Long salonId) {
        return repository.findBySalonId(salonId);
    }

}