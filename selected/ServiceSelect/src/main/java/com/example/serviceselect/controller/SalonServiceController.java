package com.example.serviceselect.controller;

import com.example.serviceselect.entity.SalonService;
import com.example.serviceselect.service.SalonServicesService;
import com.example.serviceselect.service.SessionStorageService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/services")
public class SalonServiceController {

    private final SalonServicesService service;

    @Autowired
    public SalonServiceController(SalonServicesService service) {
        this.service = service;
    }

    @GetMapping("/salon/{salonId}")
    public List<SalonService> getServicesBySalonId(@PathVariable Long salonId) {
        return service.findBySalonId(salonId);
    }
    @PostMapping("/storeSelectedServices")
    public ResponseEntity<?> storeSelectedServices(HttpSession session, @RequestBody List<Long> serviceIds) {
        session.setAttribute("selectedServices", serviceIds);
        return ResponseEntity.ok().build();
    }


}