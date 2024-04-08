package com.example.serviceselect.service;

import com.example.serviceselect.entity.SalonService;
import com.example.serviceselect.entity.SessionStorage;
import com.example.serviceselect.repository.SalonServiceRepository;
import com.example.serviceselect.repository.SessionStorageRepository;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SessionStorageService {

    @Autowired
    private final SessionStorageRepository repository;

    @Autowired
    private SalonServiceRepository salonServiceRepository;
    private final Gson gson = new Gson();

    @Autowired
    public SessionStorageService(SessionStorageRepository repository) {
        this.repository = repository;
    }

    public String createOrGetSessionId(String possibleSessionId) {
        if (possibleSessionId == null || possibleSessionId.isEmpty()) {
            // Generate a new sessionId
            possibleSessionId = UUID.randomUUID().toString();
        }

        // Check if the session already exists
        SessionStorage sessionStorage = repository.findBySessionId(possibleSessionId);
        if (sessionStorage == null) {
            // Create a new session storage entry
            sessionStorage = new SessionStorage();
            sessionStorage.setSessionId(possibleSessionId);
            repository.save(sessionStorage);
        }

        return possibleSessionId;
    }

    public void saveSelectedServices(String sessionId, String selectedServicesJson) {
        SessionStorage sessionStorage = repository.findBySessionId(sessionId);
        if (sessionStorage == null) {
            sessionStorage = new SessionStorage();
            sessionStorage.setSessionId(sessionId);
        }
        sessionStorage.setSelectedServices(selectedServicesJson);
        repository.save(sessionStorage);
    }

    public String getSelectedServices(String sessionId) {
        SessionStorage sessionStorage = repository.findBySessionId(sessionId);
        return sessionStorage != null ? sessionStorage.getSelectedServices() : null;
    }
    public List<SalonService> getServicesForSession(String sessionId) {
        SessionStorage sessionStorage = repository.findBySessionId(sessionId);
        if (sessionStorage == null || sessionStorage.getSelectedServices().isEmpty()) {
            return new ArrayList<>();
        }

        Type listType = new TypeToken<List<Long>>(){}.getType();
        List<Long> serviceIds = gson.fromJson(sessionStorage.getSelectedServices(), listType);

        return salonServiceRepository.findAllById(serviceIds);
    }

}
