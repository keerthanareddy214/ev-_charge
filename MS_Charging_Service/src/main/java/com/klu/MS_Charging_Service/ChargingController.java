package com.klu.MS_Charging_Service;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/charging")
public class ChargingController {

    private final ChargingService chargingService;

    public ChargingController(ChargingService chargingService) {
        this.chargingService = chargingService;
    }

    @PostMapping
    public ChargingSession createSession(@RequestBody ChargingSession session) {
        return chargingService.saveSession(session);
    }

    @GetMapping
    public List<ChargingSession> getAllSessions() {
        return chargingService.getAllSessions();
    }
}