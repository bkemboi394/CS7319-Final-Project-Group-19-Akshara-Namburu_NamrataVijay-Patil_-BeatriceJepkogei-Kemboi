package com.example.serviceselect.repository;


import com.example.serviceselect.entity.SalonService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalonServiceRepository extends JpaRepository<SalonService, Long> {
    List<SalonService> findBySalonId(Long salonId);
}
