package com.example.serviceselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SessionStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 36, unique = true)
    private String sessionId; // UUID formatted sessionId

    @Column(length = 10000) // Assuming JSON string; adjust size based on expected data length
    private String selectedServices; // JSON string containing selected service IDs
}
