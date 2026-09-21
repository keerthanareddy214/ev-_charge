package com.klu.MS_Charging_Service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChargingService {

    private final ChargingSessionRepository chargingSessionRepository;

    public ChargingService(ChargingSessionRepository chargingSessionRepository) {
        this.chargingSessionRepository = chargingSessionRepository;
    }

    public ChargingSession saveSession(ChargingSession session) {
        return chargingSessionRepository.save(session);
    }

    public List<ChargingSession> getAllSessions() {
        return chargingSessionRepository.findAll();
    }
}