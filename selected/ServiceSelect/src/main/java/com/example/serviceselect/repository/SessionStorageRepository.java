package com.example.serviceselect.repository;

import com.example.serviceselect.entity.SessionStorage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionStorageRepository extends JpaRepository<SessionStorage, Long> {
    SessionStorage findBySessionId(String sessionId);
}
