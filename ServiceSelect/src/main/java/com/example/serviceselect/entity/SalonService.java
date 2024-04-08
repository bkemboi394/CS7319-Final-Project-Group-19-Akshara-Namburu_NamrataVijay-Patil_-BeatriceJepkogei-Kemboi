package com.example.serviceselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SalonService {

    // Setters
    // Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "salon_id")
    private Long salonId;

    // Adjusted to reflect the name change
    @Column(name = "name") // Assuming this maps to the 'service_name' column in your request
    private String serviceName;

    @Column(name = "price")
    private Double price;


}