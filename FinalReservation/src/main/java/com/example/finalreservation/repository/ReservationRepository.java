package com.example.finalreservation.repository;

import com.example.finalreservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Additional query methods can go here
}
