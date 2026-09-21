package com.klu.MS_Charging_Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargingSessionRepository
        extends JpaRepository<ChargingSession, Long> {
}