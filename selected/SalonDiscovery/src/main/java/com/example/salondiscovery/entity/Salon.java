package com.example.salondiscovery.entity;

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
public class Salon {

    // Setters
    // Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salon_id")
    private Long id; // Salon ID

    @Column(name = "salon_name", length = 45)
    private String name; // Salon Name

    @Column(length = 45)
    private String address; // Salon Address

    @Column(name = "zipcode", length = 45)
    private String zipCode; // Salon ZipCode

    @Column(length = 45)
    private String contact; // Salon Contact Information

}
