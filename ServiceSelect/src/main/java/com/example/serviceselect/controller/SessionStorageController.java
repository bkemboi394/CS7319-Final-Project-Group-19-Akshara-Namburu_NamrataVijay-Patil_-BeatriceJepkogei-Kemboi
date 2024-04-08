package com.example.serviceselect.controller;

import com.example.serviceselect.Dto.SessionDataDto;
import com.example.serviceselect.entity.SalonService;
import com.example.serviceselect.service.SessionStorageService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8083")
@RestController
@RequestMapping("/session")
public class SessionStorageController {

    @Autowired
    private SessionStorageService service;

    @Autowired
    public SessionStorageController(SessionStorageService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveSessionData(@RequestBody SessionDataDto sessionData) {
        service.saveSelectedServices(sessionData.getSessionId(), new Gson().toJson(sessionData.getSelectedServices()));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{sessionId}")
    public String getSelectedServices(@PathVariable String sessionId) {
        return service.getSelectedServices(sessionId);
    }

    @GetMapping("/servicesForSession/{sessionId}")
    public ResponseEntity<List<SalonService>> getServicesForSession(@PathVariable String sessionId) {
        List<SalonService> services = service.getServicesForSession(sessionId);
        return ResponseEntity.ok(services);
    }

}
